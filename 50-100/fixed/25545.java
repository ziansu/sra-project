public java.lang.Byte minByte(com.nascentdigital.pipeline.Selector<TElement, java.lang.Byte> selector) {
    java.lang.Byte minimum = null;
    for (TElement element : this) {
        java.lang.Byte value = selector.select(element);
        if (minimum == null) {
            minimum = value;
        }else
            if ((value != null) && ((minimum.compareTo(value)) > 0)) {
                minimum = value;
            }
        
    }
    return minimum;
}