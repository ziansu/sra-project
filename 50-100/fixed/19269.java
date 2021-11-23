public boolean insert(java.lang.Integer key) {
    ret = true;
    if (key == null) {
        return false;
    }else
        if ((this.keys[0]) == null) {
            this.keys[0] = key;
            return true;
        }else {
            this.insertRecursiv(key);
            return ret;
        }
    
}