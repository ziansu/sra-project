public void visit(myvisitor.VBranch b) throws java.lang.Throwable {
    if (b.positive)
        myvisitor.MInstrVisitor.fbk.addLine(((("bnez " + (b.value.toString())) + " ") + (b.target.toString().substring(1))));
    else
        myvisitor.MInstrVisitor.fbk.addLine(((("beqz " + (b.value.toString())) + " ") + (b.target.toString().substring(1))));
    
}