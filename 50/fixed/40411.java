public void incSP() {
    int expanded = (this.sp) & 255;
    expanded++;
    expanded &= 255;
    this.sp = ((short) (256 | expanded));
}