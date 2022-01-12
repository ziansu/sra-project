public boolean insert(java.lang.Integer key) {
    ret = true;
    if (key == null) {
        return false;
    }
    if ((this.keys[0]) == null)
        this.keys[0] = key;
    
    this.insertRecursiv(key);
    return ret;
}