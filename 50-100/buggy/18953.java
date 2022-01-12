public void insertRecursiv(java.lang.Integer key) {
    if (!(this.contains(key))) {
        if (isLeaf()) {
            int i = einfuegePosition(key, keys);
            nodeSplit = this.addKey(i, key);
            if (nodeSplit) {
                this.split();
            }
        }else
            getTeilbaumFuer(key).insertRecursiv(key);
        
    }else
        ret = false;
    
}