public T getInflatedItem(int position) {
    za.co.cporm.model.util.CPOrmCursor<T> cursor = ((za.co.cporm.model.util.CPOrmCursor<T>) (za.co.cporm.model.loader.CPOrmCursorAdaptor.getCursor()));
    if (cursor.moveToPosition(position)) {
        return cursor.inflate();
    }
    return null;
}