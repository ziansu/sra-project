public void erase(int UID) {
    books.clear();
    database.save(books, UID);
}