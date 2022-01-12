void draw_cuve(int[] cuve) {
    yList.clear();
    for (int j = 0; j < (Y_Max); j++) {
        yList.add(((double) (cuve[j])));
        android.util.Log.i("DATA", java.lang.String.valueOf(cuve[j]));
    }
    tu.setData(yList, xRawDatas, 65536, 4096);
    tu.invalidate();
}