@java.lang.Override
public int getItemViewType(int position) {
    com.kelebro63.intechtest.models.Melody item = getItem(position);
    if (item == null)
        return 4;
    
    switch (item.getItemType()) {
        case NORMAL :
            return 0;
        case HEADER :
            return 1;
        case DIVIDER :
            return 2;
        case ACTIVE :
            return 3;
        case PROGRESS :
            return 4;
    }
    return 0;
}