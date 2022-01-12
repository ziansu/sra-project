public java.lang.Double minDouble(com.nascentdigital.pipeline.Selector<TElement, java.lang.Double> selector) {
    java.lang.Double minimum = null;
    for (TElement element : this) {
        java.lang.Double value = selector.select(element);
        if (minimum == null) {
            minimum = value;
        }else
            if ((value != null) && ((minimum.compareTo(value)) < 0)) {
                minimum = value;
            }
        
    }
    return minimum;
}