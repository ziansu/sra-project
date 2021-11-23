public java.util.Iterator<T> iterator() {
    final java.util.ListIterator<T> listIterator = list.listIterator(list.size());
    return new java.util.Iterator<T>() {
        public boolean hasNext() {
            return listIterator.hasPrevious();
        }

        public T next() {
            return listIterator.previous();
        }

        public void remove() {
            listIterator.remove();
        }
    };
}