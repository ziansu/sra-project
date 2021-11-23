public int findNextOffSetInPartition(org.eclipse.jface.text.IDocument doc, int partitionOffSet, int minIndex) throws org.eclipse.jface.text.BadLocationException {
    org.eclipse.jface.text.ITypedRegion partition = doc.getPartition(partitionOffSet);
    org.eclipse.jface.text.ITypedRegion partition2 = doc.getPartition(minIndex);
    if ((partition.getType().equals(partition2.getType())) || ((partition2.getLength()) == 0)) {
        return minIndex;
    }else {
        return findNextOffSetInPartition(doc, partitionOffSet, (minIndex + (partition2.getLength())));
    }
}