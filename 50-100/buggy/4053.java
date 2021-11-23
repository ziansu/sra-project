@java.lang.Override
public int compare(com.pooja.restaurant.search.restaurantsprovider.Restaurant r1, com.pooja.restaurant.search.restaurantsprovider.Restaurant r2) {
    int result;
    if ((r1.getRatingValue()) < (r2.getRatingValue())) {
        result = -1;
    }
    if ((r1.getRatingValue()) > (r2.getRatingValue())) {
        result = 1;
    }else {
        result = r1.getName().compareTo(r2.getName());
    }
    return result;
}