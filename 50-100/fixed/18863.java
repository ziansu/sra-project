public static void main(java.lang.String[] args) {
    try {
        Data.loadBaseData(true, true, true, true, true, true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    try {
        Calculate.run();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}