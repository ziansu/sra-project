private void updateYData() {
    top = -((int) (java.lang.Math.round((((roundY2) - (roundY1)) / 2.0))));
    bottom = ((top) + (roundY2)) - (roundY1);
}