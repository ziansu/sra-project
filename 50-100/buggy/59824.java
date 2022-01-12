public void run() {
    java.lang.System.out.println("Microprocessor started!");
    try {
        while (true) {
            java.lang.Thread.sleep(50);
            if (resetin)
                resetHandler(new Register16(32768));
            
            while (active) {
                resetHandler(new Register16(32768));
                execute();
                interruptHandler();
                if ((!(active)) && (!(trap)))
                    java.lang.System.out.println("Microprocessor Halted!");
                
            } 
        } 
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println("Microprocessor Stopped!");
    }
}