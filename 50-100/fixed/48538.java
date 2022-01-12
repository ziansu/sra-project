private int[] getPosBeforeMovement(solver.Movement move, general.Cordination after) {
    int[] arr = after.get_cords().clone();
    switch (move.getAction()) {
        case "Move up" :
            (arr[1])++;
            break;
        case "Move down" :
            (arr[1])--;
            break;
        case "Move left" :
            (arr[0])++;
            break;
        case "Move right" :
            (arr[0])--;
            break;
        default :
            return null;
    }
    return arr;
}