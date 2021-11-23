public static boolean profCompare(java.util.ArrayList<java.lang.Boolean> b) {
    boolean flag = true;
    for (int ii = 0; ii < (b.size()); ii++) {
        if ((b.get(ii)) == false) {
            flag = false;
            break;
        }
    }
    if (flag == false) {
        return false;
    }else {
        return true;
    }
}