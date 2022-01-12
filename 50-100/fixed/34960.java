@java.lang.Override
public java.util.List<sequenceDiagramGenerator.sdedit.SequenceDiagram> SelectTopK(java.util.List<sequenceDiagramGenerator.sdedit.SequenceDiagram> aList) {
    java.util.List<sequenceDiagramGenerator.sdedit.SequenceDiagram> afterSort = Prioritize(aList);
    for (int i = k; i < (aList.size()); i++) {
        afterSort.remove(k);
    }
    return afterSort;
}