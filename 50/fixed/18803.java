@java.lang.Override
public boolean contains(java.lang.String word) {
    if (word == null)
        return false;
    
    return store.contains(new BSTDictionary.KVP(word, null));
}