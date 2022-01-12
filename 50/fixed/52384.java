@com.facebook.react.uimanager.annotations.ReactProp(name = "src")
public void setSrc(com.github.barteksc.pdfviewer.PDFView view, java.lang.String src) {
    filePath = src;
    display(view, false);
}