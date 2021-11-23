public boolean borrowBook(Library lib, java.lang.String title) {
    if (lib.bookList.containsKey(title)) {
        borrowedBooks.add(lib.bookList.get(title).get(0));
        lib.bookList.get(title).remove(0);
        return true;
    }else {
        java.lang.System.out.println("Book not Found");
        return false;
    }
}