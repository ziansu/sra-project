public Polynomial sum(Polynomial p) {
    Polynomial tmp = new Polynomial();
    for (Term term : this.poly) {
        int coef = term.coef;
        int power = term.power;
        tmp.poly.add(new Term(coef, power));
    }
    tmp.add(p);
    return tmp;
}