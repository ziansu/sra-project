protected void scheduleGalleryUpdate() {
    if ((m_galleryUpdateTimer) == null) {
        m_galleryUpdateTimer = new com.google.gwt.user.client.Timer() {
            @java.lang.Override
            public void run() {
                m_galleryUpdateTimer = null;
                updateGalleryData();
            }
        };
        m_galleryUpdateTimer.schedule(50);
    }
}