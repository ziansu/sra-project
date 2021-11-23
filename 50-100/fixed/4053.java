@java.lang.Override
public int compare(com.pooja.restaurant.search.restaurantsprovider.Restaurant r1, com.pooja.restaurant.search.restaurantsprovider.Restaurant r2) {
    int result = java.lang.Double.compare(r1.getRatingValue(), r2.getRatingValue());
    if (result == 1) {
        result = -1;
    }else
        if (result == (-1)) {
            result = 1;
        }else
            if (result == 0) {
                result = r1.getName().compareTo(r2.getName());
            }
        
    
    return result;
}