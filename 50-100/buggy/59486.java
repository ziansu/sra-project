public void run() {
    if (notFacingNorth()) {
        if (frontIsClear()) {
            if (noBeepersPresent()) {
                PtB();
                move();
            }
        }
        if (frontIsClear()) {
            move();
        }else {
            GoB();
            move();
        }
    }
}