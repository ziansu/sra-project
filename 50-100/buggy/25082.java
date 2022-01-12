private void createNewEvent() {
    switch (random.nextInt(5)) {
        case 0 :
            createJunctionFailureEvent(false, testCase);
            break;
        case 1 :
            createJunctionFailureEvent(true, testCase);
            break;
        case 2 :
            createTeleportEvent(false, testCase);
            break;
        case 3 :
            createTeleportEvent(true, testCase);
            break;
        case 4 :
            createFreeGoldEvent(testCase);
            break;
        default :
            throw new java.lang.IllegalArgumentException("Random number was out of bounds in CreateNewEvent()");
    }
}