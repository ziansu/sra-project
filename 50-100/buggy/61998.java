@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (null == other)
        return false;
    
    if (!(other instanceof gr.demokritos.biographs.indexing.structs.TrieEntry))
        return false;
    
    gr.demokritos.biographs.indexing.structs.TrieEntry eOther = ((gr.demokritos.biographs.indexing.structs.TrieEntry) (other));
    if (this.getLabel().equals(eOther.getLabel())) {
        if (this.getEncoding().equals(eOther.getEncoding()))
            return true;
        else
            return false;
        
    }else {
        return false;
    }
}