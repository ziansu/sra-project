@java.lang.Override
public void setAutoFormat(boolean autoFormat) {
    if (autoFormat) {
        cachedFormats.clear();
    }
    super.setAutoFormat(autoFormat);
}