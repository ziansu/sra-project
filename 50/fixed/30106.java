public void save(org.w3c.dom.Document svgDocument) {
    java.io.File svgFile = generateSaveUI();
    if (noFileSpecified(svgFile))
        return ;
    else {
        writeSVGToFile(svgDocument, svgFile);
    }
    return ;
}