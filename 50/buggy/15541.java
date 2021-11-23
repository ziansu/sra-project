public T reomve(T t) {
    if (heap.isEmpty()) {
        java.lang.System.out.println("No element to remove \n");
        return null;
    }
    return heap.poll();
}