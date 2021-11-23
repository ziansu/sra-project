@org.junit.Before
public void createElement() {
    book1 = new fhj.shelf.utils.Book("Book1", "Author1");
    book2 = new fhj.shelf.utils.Book("Book2", "Author2");
    col = new fhj.shelf.utils.BookCollection("Collection of Books");
    col.addElement(book1);
    col.addElement(book2);
    cd = new fhj.shelf.utils.CD("CD1", 20);
    elementsRepository = new fhj.shelf.utils.repos.InMemoryElementsRepository();
    elementsRepository.insert(col);
    elementsRepository.insert(cd);
}