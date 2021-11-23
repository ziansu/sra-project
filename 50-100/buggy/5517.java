public static boolean is_between(int newID, int prevID, int nextID) {
    java.lang.System.out.println("---------");
    java.lang.System.out.printf("new: %d\tprev: %d\tnext: %d\n", newID, prevID, nextID);
    java.lang.System.out.println("---------");
    if ((((prevID < newID) && (newID < nextID)) || ((nextID < prevID) && (prevID < newID))) || ((newID < nextID) && (nextID < prevID))) {
        return true;
    }else {
        return false;
    }
}