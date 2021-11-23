public za.co.NoNameLibrary.domain.BookOrder.Builder copy(za.co.NoNameLibrary.domain.BookOrder orders) {
    this.date = orders.date;
    this.id = orders.id;
    bookList = orders.bookList;
    this.totalPrice = orders.totalPrice;
    return this;
}