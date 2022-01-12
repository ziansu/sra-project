public T reomve() {
    if (heap.isEmpty()) {
        java.lang.System.out.println("No element to remove \n");
        return null;
    }
    return heap.poll();
}