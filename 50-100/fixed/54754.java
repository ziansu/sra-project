public java.lang.Long minLong(com.nascentdigital.pipeline.Selector<TElement, java.lang.Long> selector) {
    java.lang.Long minimum = null;
    for (TElement element : this) {
        java.lang.Long value = selector.select(element);
        if (minimum == null) {
            minimum = value;
        }else
            if ((value != null) && ((minimum.compareTo(value)) > 0)) {
                minimum = value;
            }
        
    }
    return minimum;
}