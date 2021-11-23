@com.oracle.truffle.api.nodes.ExplodeLoop
private java.lang.Object getEnclosingObject(final som.vmobjects.SObjectWithClass receiver, final som.vmobjects.SClass lexicalClass) {
    int ctxLevel = (contextLevel) - 1;
    som.vmobjects.SObjectWithClass enclosing = lexicalClass.getEnclosingObject();
    while (ctxLevel > 0) {
        ctxLevel--;
        enclosing = enclosing.getSOMClass().getEnclosingObject();
    } 
    return enclosingObj.profile(enclosing);
}