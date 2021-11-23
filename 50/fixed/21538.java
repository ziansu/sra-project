private java.lang.String inquire(java.lang.String prompt, java.lang.String title, java.lang.String dflt) {
    java.lang.String answer = guiUtils.getInput(prompt, title, dflt);
    return answer != null ? answer : dflt;
}