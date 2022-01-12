private static boolean isEdgeOppositeEdge(java.lang.Integer edge, int pos) {
    boolean returnVal = false;
    switch (edge) {
        case 1 :
            returnVal = pos == 7;
            break;
        case 3 :
            returnVal = pos == 5;
            break;
        case 5 :
            returnVal = pos == 3;
            break;
        case 7 :
            returnVal = pos == 1;
            break;
    }
    return returnVal;
}