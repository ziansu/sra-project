@java.lang.Override
public int getCount() {
    if ((mList) != null) {
        return mList.size();
    }else
        if ((mMap) != null) {
            return keys.length;
        }else {
            return 0;
        }
    
}