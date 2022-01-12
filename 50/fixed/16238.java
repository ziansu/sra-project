@java.lang.Override
public void visit(int docID, byte[] packedValue) throws java.io.IOException {
    currentNode[0].addDoc(docID, packedValue);
}