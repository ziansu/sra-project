public boolean search(java.lang.String word) {
    com.muks.DSC.Tries.TrieNode t = searchNode(word);
    if ((t != null) && (t.isLeaf))
        return true;
    else
        return false;
    
}