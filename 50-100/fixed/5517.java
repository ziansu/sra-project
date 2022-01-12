public static boolean is_between(int newID, int prevID, int nextID) {
    if ((((prevID < newID) && (newID < nextID)) || ((nextID < prevID) && (prevID < newID))) || ((newID < nextID) && (nextID < prevID))) {
        return true;
    }else {
        return false;
    }
}