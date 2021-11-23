int updatetotal() {
    int total = 0;
    double dtotal;
    android.widget.TextView txt = ((android.widget.TextView) (findViewById(R.id.txtPrice)));
    for (tech.travis.poolpos.MenuMaker mmi : menulist) {
        total += (mmi.getCount()) * (mmi.getPrice());
    }
    dtotal = total;
    txt.setText(format.format((dtotal / 100)));
    refreshOrder();
    return total;
}