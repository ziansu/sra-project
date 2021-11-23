private void updateLine() {
    java.lang.String creditsEarned = client.getServer().getCreditEarnedOnCurrentSession();
    int charToRemove = line.length();
    java.lang.System.out.print("\r");
    line = java.lang.String.format("Frames rendered: %d remaining: %d credits earned: %s | %s", rendered, remaining, (creditsEarned != null ? creditsEarned : "unknown"), ((status) + (exiting ? " (Exiting after this frame)" : "")));
    java.lang.System.out.print(line);
    for (int i = line.length(); i <= charToRemove; i++) {
        java.lang.System.out.print(" ");
    }
}