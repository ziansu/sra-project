private void swap(final O obj) {
    final T stackValue = stack.get(top);
    T value = null;
    if (stackValue != null)
        value = property.set(obj, stackValue);
    else
        property.remove(obj);
    
    stack.set(top, value);
}