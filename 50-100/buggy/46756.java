@java.lang.Override
public T pop() throws java.lang.InterruptedException {
    try {
        permissionToModifyStack.acquire();
        if (empty())
            throw new java.util.EmptyStackException();
        
        final T element = stackVector[head];
        stackVector[((head)++)] = null;
        return element;
    } finally {
        permissionToModifyStack.release();
    }
}