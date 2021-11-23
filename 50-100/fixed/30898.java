public void run() {
    boolean isRunning = true;
    java.lang.String tempInput = null;
    while (isRunning) {
        java.lang.System.out.print("Select \"[p]lay\", \"[s]tats\", or \"[q]uit\": ");
        tempInput = in.nextLine();
        switch (tempInput) {
            case "p" :
                curController.runRound(getThrow());
                break;
            case "s" :
                showStats();
                break;
            case "q" :
                deconstruct();
                isRunning = false;
                break;
            default :
                break;
        }
    } 
}