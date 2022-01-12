public T findId(long id) {
    assert isOk();
    return findId(id, items);
}