@java.lang.Override
protected void initialize() {
    super.initialize();
    imageView.setImage(com.helegris.szorengeteg.ui.DefaultImage.getInstance());
    int ordinal = (topicLoader.loadAll().size()) + 1;
    lblOrdinal.setText((ordinal + ". "));
}