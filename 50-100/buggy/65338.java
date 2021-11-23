public com.hyena.coretext.CYSinglePageView.Builder getBuilder(android.view.View attachView, java.lang.String tag, java.lang.String text) {
    com.hyena.coretext.CYSinglePageView.Builder builder = getCachedPage(attachView, tag);
    if (builder == null) {
        builder = new com.hyena.coretext.CYSinglePageView.Builder(getContext(), text);
        setCachePage(attachView, tag, builder);
    }
    builder.setTag(tag);
    builder.setRender(this);
    builder.getEventDispatcher().addLayoutEventListener(this);
    this.mBuilder = builder;
    return mBuilder;
}