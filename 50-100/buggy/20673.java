public static <Y> boolean contains(Y[] arr, Y value) {
    if (util.ArrayUtil.isEmpty(arr))
        return false;
    
    for (int n = 0; n < (arr.length); n++) {
        if (arr[n].equals(value))
            return true;
        
    }
    return false;
}