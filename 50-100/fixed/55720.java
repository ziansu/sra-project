public void delete(int x, int y) {
    Term delete_term = new Term(x, y);
    for (int i = 0; i < (polynomial_list.size()); i++) {
        Term term = polynomial_list.get(i);
        if (term.equals(delete_term)) {
            polynomial_list.remove(term);
        }
    }
}