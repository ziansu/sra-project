static void Log(java.lang.String log, int mode) {
    if (mode == 1) {
        java.lang.System.out.println("MineCordBot > CodeName: Log -> ");
    }else
        if (mode == 2) {
            java.lang.System.out.println("MineCordBot > CodeName: Warn -> ");
        }else
            if (mode == 3) {
                java.lang.System.out.println("MineCordBot > CodeName: Error -> ");
            }else {
                java.lang.System.out.println("Error: Unknown mode.");
            }
        
    
}