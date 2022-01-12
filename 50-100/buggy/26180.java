public void run() {
    try {
        if ((nStep) > (-1)) {
            (nStep)--;
            java.lang.System.out.println(nStep);
            l.setPlayer(gameStates.get(((nStep) + 1)).getpDep());
            gui.notify(false, gameStates.get(nStep).getId(), false);
        }
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.Exception e) {
        }
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
    }
}