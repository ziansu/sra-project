public void multiply(solver.Polynomial p) {
    solver.Term current = p.getFirst();
    if ((first) == null) {
        first = p.getFirst();
        (size)++;
    }else {
        while (current != null) {
            this.multiply(current);
            current = current.getNext();
        } 
    }
}