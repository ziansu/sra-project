@java.lang.Override
public int compare(model.event.RestaurantEvent o1, model.event.RestaurantEvent o2) {
    if ((o1.getTime()) > (o2.getTime()))
        return -1;
    
    if ((o1.getTime()) == (o2.getTime()))
        return 0;
    
    return 1;
}