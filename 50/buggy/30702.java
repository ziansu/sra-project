public T findId(int id) {
    assert isOk();
    return findId(id, items);
}