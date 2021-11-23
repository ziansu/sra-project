public void updateRank() {
    java.util.Iterator<Edge> it = edges.iterator();
    Edge current;
    while (it.hasNext()) {
        current = it.next();
        Node start = current.getStart();
        Node end = current.getEnd();
        double new_rank = calculateAmount(start);
        start.setRank(new_rank);
    } 
}