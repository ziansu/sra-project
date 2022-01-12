public void run() {
    java.lang.System.out.println("Microprocessor started!");
    try {
        while (true) {
            java.lang.Thread.sleep(50);
            if (resetin)
                resetHandler();
            
            while (active) {
                resetHandler();
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