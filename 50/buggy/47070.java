public void validate(java.lang.String path) {
    this.filePath = path;
    switch (getFileExtension()) {
        case XHTML :
            checkXHTML();
            break;
        case CSS :
            checkCSS();
            break;
        case SVG :
            checkSVG();
            break;
    }
}