@java.lang.Override
public int getCount() {
    if ((eventList.size()) == 0)
        return 1;
    
    return 2 + (eventList.size());
}