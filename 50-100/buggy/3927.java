public mashine.ui.FlatColor dim(float multiplier) {
    mashine.ui.FlatColor c = new mashine.ui.FlatColor(this);
    c.setBrightness(((c.getBrightness()) * multiplier));
    c.setAlpha(((int) ((c.getAlpha()) * multiplier)));
    return c;
}