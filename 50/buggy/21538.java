private java.lang.String inquire(java.lang.String prompt, java.lang.String title, java.lang.String dflt) {
    java.lang.String answer = guiUtils.getInput("Enter your name of this remote", "Remote name entry", dflt);
    return answer != null ? answer : dflt;
}