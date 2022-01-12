public at.jku.ssw.cmm.compiler.Node createArrayAssignment(at.jku.ssw.cmm.compiler.Obj curObj, java.util.ArrayList<java.lang.Integer> dimensions, java.util.ArrayList<java.lang.Integer> openDimensions, int index) {
    at.jku.ssw.cmm.compiler.Struct curType = curObj.type.elemType;
    at.jku.ssw.cmm.compiler.Node e = new at.jku.ssw.cmm.compiler.Node(Node.INDEX, new at.jku.ssw.cmm.compiler.Node(curObj), new at.jku.ssw.cmm.compiler.Node(index), curObj.line);
    e.type = curType;
    curType = curType.elemType;
    return e;
}