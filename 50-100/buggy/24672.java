@java.lang.Override
public int getIndexOf(android.support.v4.app.Fragment fragment) {
    int fragmentsCount = getFragmentsCount();
    if ((fragment == null) || (fragmentsCount == 0))
        return -1;
    
    for (int i = 0; i < fragmentsCount; ++fragmentsCount) {
        if ((getFragmentAt(i)) == fragment)
            return i;
        
    }
    return -1;
}