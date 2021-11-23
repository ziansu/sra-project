@com.scottlogic.libraryapp.web.GetMapping(value = "/books/{Id}")
@com.scottlogic.libraryapp.web.ResponseBody
public com.scottlogic.libraryapp.domain.Book getBook(@com.scottlogic.libraryapp.web.PathVariable(value = "Id")
final java.lang.Integer Id) {
    final java.util.Optional<com.scottlogic.libraryapp.domain.Book> book = bookService.getById(Id);
    if (book.isPresent()) {
        return book.get();
    }else {
        throw new javax.persistence.EntityNotFoundException(("No book found with id " + Id));
    }
}