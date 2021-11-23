public int getCost() {
    if ((head) == null)
        return 0;
    else {
        FeatureNode current = head;
        int cost = 0;
        while (current != null) {
            cost += current.getCost();
            current = current.getNext();
        } 
        return cost;
    }
}