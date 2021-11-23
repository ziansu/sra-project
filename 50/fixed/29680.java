@java.lang.Override
protected void generate() {
    super.generate();
    bitmap(bitmap, premultiplied);
    filter(fModeMin, fModeMax);
    wrap(wModeH, wModeV);
}