public simpledb.TupleDesc getTupleDesc(int tableid) throws java.util.NoSuchElementException {
    int flag = 0;
    for (int i = 0; i < (cat.size()); i++) {
        if ((cat.get(i).tableID) == (tableID)) {
            cat.get(i).td.toString();
            flag = 1;
        }
        if (flag == 1)
            break;
        
    }
    if (flag == 0)
        java.lang.System.out.println("No such table exists");
    
    return null;
}