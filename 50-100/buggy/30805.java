public boolean add(final sk.stuba.fiit.ms.session.Search search) {
    if (search.getResults().isEmpty()) {
        return false;
    }
    int i = 0;
    for (; i < (searches.size()); i++) {
        if ((searches.get(i).getTimeStamp()) > (search.getTimeStamp())) {
            break;
        }
    }
    searches.add(i, search);
    return true;
}