public openmods.utils.Stack<E> substack(int depth) {
    final int newBottom = (data.size()) - depth;
    if (newBottom < 0)
        throw new openmods.utils.Stack.StackUnderflowException(java.lang.String.format("Not enough elements to create substack: required ds, size %d", depth, size()));
    
    return newBottom == 0 ? this : new openmods.utils.Stack<E>(data, newBottom);
}