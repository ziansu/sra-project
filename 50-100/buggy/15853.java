public java.lang.Integer minInteger(com.nascentdigital.pipeline.Selector<TElement, java.lang.Integer> selector) {
    java.lang.Integer minimum = null;
    for (TElement element : this) {
        java.lang.Integer value = selector.select(element);
        if (minimum == null) {
            minimum = value;
        }else
            if ((value != null) && ((minimum.compareTo(value)) < 0)) {
                minimum = value;
            }
        
    }
    return minimum;
}