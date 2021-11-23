public void generateCode() throws SemanticAnalysis.SemanticAnalysisException, java.io.IOException {
    head.generateCode();
    if ((this.tail) != null) {
        tail.generateCode();
    }
}