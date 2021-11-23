public void incSP() {
    short expanded = this.sp;
    expanded &= 255;
    expanded++;
    this.sp = ((short) (256 | expanded));
}