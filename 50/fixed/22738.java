public int getSize() {
    return ((len) / (com.odong.buddhismhomework.models.Pager.LINES)) + (((len) % (com.odong.buddhismhomework.models.Pager.LINES)) == 0 ? 0 : 1);
}