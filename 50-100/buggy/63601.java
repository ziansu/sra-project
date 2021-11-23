public void highlightSourceCode(int line) {
    java.lang.Object[] objLine = at.jku.ssw.cmm.preprocessor.Preprocessor.returnFileAndNumber(line, this.main.getLeftPanel().getSourceCodeRegister());
    if (objLine[0].equals("main"))
        this.highlightSourceCodeDirectly(((int) (objLine[1])));
    
}