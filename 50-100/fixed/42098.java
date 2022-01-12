private Node getNode(int position) {
    if (position <= 0)
        return null;
    
    if (position > (nodes))
        return null;
    
    if (position == 1)
        return start;
    
    Node query = start;
    for (int i = 0; i < (position - 1); i++) {
        query = query.getNextNode();
    }
    return query;
}