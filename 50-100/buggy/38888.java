public mas.cv4.Offer makeOffer(mas.cv4.DFAgentDescription agent, mas.cv4.SellMeBooks request) {
    if (!(shouldEvenConsider(request))) {
        return null;
    }
    mas.cv4.ArrayList<mas.cv4.BookInfo> myBooks = ai.getBooks();
    return traders[agent].makeOffer(request, myBooks);
}