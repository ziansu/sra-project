@java.lang.Override
public int getChildrenCount(int i) {
    if ((listHashMap.get(listDataHeader.get(i))) != null)
        return listHashMap.get(listDataHeader.get(i)).size();
    else
        return 0;
    
}