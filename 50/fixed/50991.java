@java.lang.Override
public int getCount() {
    if ((getDataManager()) != null)
        return getDataManager().size();
    
    return 0;
}