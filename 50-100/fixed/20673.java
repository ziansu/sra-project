public static <Y> boolean contains(Y[] arr, Y value) {
    if (util.ArrayUtil.isEmpty(arr))
        return false;
    
    for (Y element : arr) {
        if (element.equals(value))
            return true;
        
    }
    return false;
}