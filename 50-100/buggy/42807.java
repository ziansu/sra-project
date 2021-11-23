@java.lang.Override
public void insertEntity(E entity, long wolID, edu.wol.dom.space.Position position) throws java.io.IOException, java.lang.Exception {
    T wol = findWol(wolID);
    if (wol != null) {
        wol.insertEntity(position, entity);
        repository.insert(entity);
        repository.insert(position);
        repository.update(wol);
    }
}