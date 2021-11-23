public void add(final sk.stuba.fiit.ms.session.Search search) {
    int i = 0;
    for (; i < (searches.size()); i++) {
        if ((searches.get(i).getTimeStamp()) > (search.getTimeStamp())) {
            break;
        }
    }
    searches.add(i, search);
}