@java.lang.Override
public int getItemViewType(int position) {
    if (position == 0)
        return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_FIRST_CELL;
    
    if (position == 1)
        return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_SECOND_CELL;
    
    if (position == 2)
        return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_THIRD_CELL;
    
    if (position == 3)
        return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_REVIEW_CELL;
    
    if (position == 4)
        return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_NOTE_CELL;
    
    if (position == 5)
        return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_FOURTH_CELL;
    
    return com.ht.adapter.RestaurantDetailsListAdapter.VIEW_TYPE_FIFTH_CELL;
}