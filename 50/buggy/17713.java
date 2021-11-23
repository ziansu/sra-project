public void setContent(java.lang.String html, java.lang.String masterCSS) {
    container.updateBuffer();
    this.document = new zetes.wings.litehtml.jni.Document(html, masterCSS, container);
    redraw();
}