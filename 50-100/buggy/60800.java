public repository.Event generateEventMock(java.lang.String t, int max, double p, java.lang.String l, int id) {
    java.lang.String title = t;
    int maxNumber = max;
    double price = p;
    java.lang.String location = l;
    java.util.Date date = dato1;
    return new repository.Event(title, maxNumber, price, location, date, id);
}