public void run() {
    while (notFacingNorth()) {
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