public void atualiza(final T t) {
    getSession().merge(t);
}