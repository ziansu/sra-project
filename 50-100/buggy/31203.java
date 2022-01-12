private movienight.javi.com.movienight.model.FilterableItem isItemClassInList(movienight.javi.com.movienight.model.FilterableItem item) {
    int position = -1;
    for (int i = 0; i < (mItems.size()); i++) {
        movienight.javi.com.movienight.model.FilterableItem fi = mItems.get(i);
        if (fi.getClass().equals(item.getClass())) {
            return fi;
        }
    }
    return null;
}