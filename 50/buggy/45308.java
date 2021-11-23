public void add(org.csie.mpp.buku.db.BookEntry entry) {
    if ((vm.length()) < 0)
        createBookView();
    
    vm.add(entry);
}