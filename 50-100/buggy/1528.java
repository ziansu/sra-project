public static boolean setGenerationLifeStatus(int numberOfNeighbors, model.LifeSquare curentSquare) {
    boolean isCellAliveStatus = false;
    switch (numberOfNeighbors) {
        case 0 :
        case 1 :
            isCellAliveStatus = false;
            break;
        case 2 :
        case 3 :
            isCellAliveStatus = true;
            break;
        default :
            if (curentSquare.isAlive()) {
                isCellAliveStatus = false;
            }
            if (!(curentSquare.isAlive())) {
                isCellAliveStatus = true;
            }
            break;
    }
    return isCellAliveStatus;
}