public boolean next_one(files.files.directory_entryHolder e) {
    boolean boo = iterator.hasNext();
    if (boo)
        e.value = iterator.next();
    
    return boo;
}