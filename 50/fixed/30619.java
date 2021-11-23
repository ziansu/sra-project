@java.lang.Override
protected com.codename1.ui.geom.Dimension calcPreferredSize() {
    if ((nativeVideo) != null) {
        return new com.codename1.ui.geom.Dimension(nativeVideo.getWidth(), nativeVideo.getHeight());
    }
    return new com.codename1.ui.geom.Dimension();
}