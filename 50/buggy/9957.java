public void setEdges(com.company.DataStructure.Node<T> child) {
    if (getEdges().contains(child)) {
        getEdges().remove(child);
    }
    getEdges().add(child);
}