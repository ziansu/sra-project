private int getPosition(int position) {
    if (position > 4) {
        return position - ((int) (java.lang.Math.ceil((position / 4))));
    }else {
        return position;
    }
}