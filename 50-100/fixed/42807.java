@java.lang.Override
public void insertEntity(E entity, long wolID, edu.wol.dom.space.Position position) throws java.io.IOException, java.lang.Exception {
    T wol = findWol(wolID);
    if (wol != null) {
        repository.insert(entity);
        repository.insert(position);
        wol.insertEntity(position, entity);
        repository.update(wol);
    }
}