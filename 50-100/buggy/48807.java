public long getLastDateWithData() {
    long lastDate = java.lang.Long.MAX_VALUE;
    for (java.util.Set<org.helioviewer.jhv.plugins.eveplugin.draw.DrawableElement> des : drawableElements.values()) {
        for (org.helioviewer.jhv.plugins.eveplugin.draw.DrawableElement de : des) {
            long temp = de.getLastDateWithData();
            if (temp < lastDate) {
                lastDate = temp;
            }
        }
    }
    return lastDate;
}