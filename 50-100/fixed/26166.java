public void writeRecords(edu.nyu.tandon.tool.renumber.Renumber.InvertedList invertedList) throws java.io.IOException {
    for (int document : invertedList.documents) {
        edu.nyu.tandon.tool.renumber.Renumber.Posting p = invertedList.postings.get(document);
        it.unimi.dsi.io.OutputBitStream out = indexWriter.newDocumentRecord();
        indexWriter.writeDocumentPointer(out, document);
        if (index.hasPayloads)
            indexWriter.writePayload(out, p.payload);
        
        if (index.hasCounts)
            indexWriter.writePositionCount(out, p.positionCount);
        
        if (index.hasPositions)
            indexWriter.writeDocumentPositions(out, p.positions, 0, p.positionCount, p.documentSize);
        
    }
}