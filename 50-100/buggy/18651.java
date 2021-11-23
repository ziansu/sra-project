public void add(DPD.Model.CNode cNode) {
    if (containsKey(cNode.classId))
        java.lang.System.out.println(("warn: Entity.add() - overwriting class " + (cNode.classId)));
    
    put(cNode.classId, cNode);
    if (pockets.containsKey(cNode.pocket))
        pockets.get(cNode.pocket).add(cNode.classId);
    else {
        pockets.put(cNode.pocket, DPD.Util.list(cNode.classId));
    }
}