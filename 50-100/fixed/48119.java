public void updateRank() {
    java.util.Iterator<Edge> it = edges.iterator();
    Edge current;
    Node end = null;
    Node start = null;
    while (it.hasNext()) {
        current = it.next();
        start = current.getStart();
        double new_rank = calculateAmount(start);
        end = current.getEnd();
        end.updateRank(new_rank);
    } 
}