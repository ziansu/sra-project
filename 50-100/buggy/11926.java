private void dataInit() {
    for (int i = 0; i < 3; i++) {
        java.util.ArrayList<java.lang.Integer> tmp = new java.util.ArrayList<java.lang.Integer>();
        dataMagnetic.add(tmp);
        dataOrientation.add(tmp);
        dataAccelerate.add(tmp);
        dataGyroscope.add(tmp);
        dataGravity.add(tmp);
    }
}