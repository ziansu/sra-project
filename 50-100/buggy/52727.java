public static void main(java.lang.String[] args) {
    Arvore a = new Arvore(11);
    a.add(2);
    a.add(14);
    a.add(15);
    a.add(1);
    a.add(7);
    a.add(8);
    a.add(5);
    a.add(4);
    a.delete(a.encontra(5));
    a.raiz.print();
}