protected boolean checkBlock(org.w3c.dom.Node node) {
    mt.edu.um.cs.cps2000.runtime.BlockStackFrame blockStackFrame = new mt.edu.um.cs.cps2000.runtime.BlockStackFrame(stackFrames.peek());
    stackFrames.push(blockStackFrame);
    boolean ok = checkStatements(node.getChildNodes());
    stackFrames.pop();
    return ok;
}