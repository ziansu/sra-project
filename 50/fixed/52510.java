public void putContigID(java.lang.String name, int id) {
    if ((getContigID(name)) != null)
        return ;
    
    tmpContigID.put(name, id);
    contigID.put(name, id);
}