void visitOctalInteger(nez.ast.jcode.JCodeTree p) {
    this.mBuilder.push(java.lang.Integer.parseInt(p.getText()));
}