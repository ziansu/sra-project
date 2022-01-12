private void swap(final O obj) {
    final T stackValue = stack.get(top);
    final T value = (stackValue != null) ? property.set(obj, stackValue) : property.remove(obj);
    stack.set(top, value);
}