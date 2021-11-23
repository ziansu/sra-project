public java.lang.Boolean insert(bufmgr.Pair newPair) {
    java.lang.Boolean status = false;
    if (!(linkedList.contains(newPair)))
        status = linkedList.add(newPair);
    
    return status;
}