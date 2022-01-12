public void generateCode() throws SemanticAnalysis.SemanticAnalysisException, java.io.IOException {
    if ((head) != null) {
        head.generateCode();
        if ((this.tail) != null) {
            tail.generateCode();
        }
    }
}