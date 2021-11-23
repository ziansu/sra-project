public void save(org.w3c.dom.Document svgDocument) {
    generateSaveUI();
    if (noFileSpecified(svgFile))
        return ;
    else {
        writeSVGToFile(svgDocument, svgFile);
    }
    return ;
}