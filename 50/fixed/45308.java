public void add(org.csie.mpp.buku.db.BookEntry entry) {
    if ((vm.length()) < 1)
        createBookView();
    
    vm.add(entry);
}