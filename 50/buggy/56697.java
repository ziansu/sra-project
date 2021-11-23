@java.lang.Override
public final boolean containsKey(java.lang.Object key) {
    for (int i = 0; i < (len); i = +2)
        if (pjson.Util.equiv(arr[i], key))
            return true;
        
    
    return false;
}