public boolean search(java.lang.String word) {
    com.muks.DSC.Tries.TrieNode t = searchNode(word);
    java.lang.System.out.println(("+ Search returned trie node = " + (t.children)));
    if ((t != null) && (t.isLeaf))
        return true;
    else
        return false;
    
}