private java.lang.String loop() {
    java.lang.String exitCode = "";
    while (exitCode == "") {
        try {
            java.lang.Thread.sleep(20);
            if ((getPlayer().getHealth()) <= 0) {
                exitCode = "die";
            }
        } catch (java.lang.InterruptedException ignored) {
        }
    } 
    return exitCode;
}