public static <I> int indexOf(I[] arr, I value) {
    if (util.ArrayUtil.isEmpty(arr))
        return util.ArrayUtil.INDEX_NOT_FOUND;
    
    int index = 0;
    for (I item : arr) {
        if (item == value)
            return index;
        
        index++;
    }
    return util.ArrayUtil.INDEX_NOT_FOUND;
}