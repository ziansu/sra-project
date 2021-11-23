@java.lang.Override
public void removeLine(com.tsystems.javaschool.dao.entity.Book book) {
    java.util.List<com.tsystems.javaschool.dao.entity.OrderLine> currentLines = shoppingCart.getItems();
    java.util.Iterator<com.tsystems.javaschool.dao.entity.OrderLine> i = currentLines.iterator();
    while (i.hasNext()) {
        com.tsystems.javaschool.dao.entity.OrderLine orderLine = i.next();
        if (orderLine.getBook().equals(book)) {
            i.remove();
        }
    } 
}