@java.lang.Override
public int compareTo(com.ericpol.hotmeals.Entities.Dish dish) {
    if ((id) < (dish.getId()))
        return -1;
    else
        if ((id) == (dish.getId()))
            return 0;
        else
            return 1;
        
    
}