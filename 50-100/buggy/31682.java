public java.lang.Float minFloat(com.nascentdigital.pipeline.Selector<TElement, java.lang.Float> selector) {
    java.lang.Float minimum = null;
    for (TElement element : this) {
        java.lang.Float value = selector.select(element);
        if (minimum == null) {
            minimum = value;
        }else
            if ((value != null) && ((minimum.compareTo(value)) < 0)) {
                minimum = value;
            }
        
    }
    return minimum;
}