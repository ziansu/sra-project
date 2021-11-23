public boolean hasNext() {
    return (iterator.hasNext()) || (hasNextPage());
}