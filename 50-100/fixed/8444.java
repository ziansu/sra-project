public void multiply(solver.Polynomial p) {
    solver.Polynomial output = new solver.Polynomial();
    solver.Term current = p.getFirst();
    if ((first) == null) {
        first = p.getFirst();
        (size)++;
    }else {
        while (current != null) {
            solver.Polynomial temp = new solver.Polynomial(this.getFirst());
            temp.multiply(current);
            output.add(temp);
            current = current.getNext();
        } 
    }
}