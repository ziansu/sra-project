public void getAllContentViewCores(java.util.List<org.chromium.content.browser.ContentViewCore> content) {
    if ((mContentViewCore) != null)
        content.add(mContentViewCore);
    
    for (int i = 0; i < (mOverlayContentViewCores.size()); i++) {
        content.add(mOverlayContentViewCores.get(i));
    }
}