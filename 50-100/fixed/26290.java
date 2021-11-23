static void Log(java.lang.String log, int mode) {
    if (mode == 1) {
        java.lang.System.out.println(("MineCordBot > CodeName: Log -> " + log));
    }else
        if (mode == 2) {
            java.lang.System.out.println(("MineCordBot > CodeName: Warn -> " + log));
        }else
            if (mode == 3) {
                java.lang.System.out.println(("MineCordBot > CodeName: Error -> " + log));
            }else {
                java.lang.System.out.println("Error: Unknown mode.");
            }
        
    
}