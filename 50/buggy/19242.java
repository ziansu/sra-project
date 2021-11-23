public boolean next_one(files.files.directory_entryHolder e) {
    boolean boo = it.hasNext();
    if (boo)
        e.value = it.next();
    
    return boo;
}