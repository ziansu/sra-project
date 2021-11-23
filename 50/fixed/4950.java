private microbat.codeanalysis.runtime.ProgramExecutor.PointWrapper findCorrespondingPointWrapper(microbat.model.trace.TraceNode lastestNode, java.util.List<microbat.codeanalysis.runtime.ProgramExecutor.PointWrapper> executionOrderList) {
    if (lastestNode == null) {
        return null;
    }
    return executionOrderList.get(((lastestNode.getOrder()) - 1));
}