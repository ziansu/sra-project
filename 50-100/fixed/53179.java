@java.lang.Override
protected void initialize() {
    super.initialize();
    imageView.setImage(com.helegris.szorengeteg.ui.DefaultImage.getInstance());
    ordinal = (topicLoader.loadAll().size()) + 1;
    lblOrdinal.setText(((ordinal) + ". "));
}