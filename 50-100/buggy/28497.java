private static void print(mining.TempResult.Node n) {
    launcher.Debugger.log(((n.code.toString(mining.TempResult.vertexRank2Label, mining.TempResult.edgeRank2Label)) + "\n"));
    java.util.List<mining.TempResult.Node> childs = n.childs;
    if (childs == null) {
        return ;
    }
    for (int index = 0; index < (childs.size()); index++) {
        mining.TempResult.print(childs.get(index));
    }
}