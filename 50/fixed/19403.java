@java.lang.Override
public E add(E element) {
    if ((this.managedProvider) != null) {
        this.managedProvider.add(element);
        return element;
    }else {
        throw new java.lang.IllegalStateException("ManagedProvider is not available");
    }
}