public void highlightSourceCode(int line) {
    java.lang.Object[] objLine = at.jku.ssw.cmm.preprocessor.Preprocessor.returnFileAndNumber(line, this.main.getLeftPanel().getSourceCodeRegister());
    if ((objLine[0].equals("main")) && (((int) (objLine[1])) >= 0))
        this.highlightSourceCodeDirectly(((int) (objLine[1])));
    
}