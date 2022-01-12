public static java.util.ArrayList<java.lang.Integer> getNotCovered(int[] status) {
    java.util.ArrayList<java.lang.Integer> notCovered = new java.util.ArrayList<>();
    for (int i = 0; i < (status.length); i++) {
        if ((status[i]) != 0) {
            notCovered.add(status[i]);
        }
    }
    return notCovered;
}