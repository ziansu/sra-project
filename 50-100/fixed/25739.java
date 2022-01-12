public T getInflatedItem(int position) {
    za.co.cporm.model.util.CPOrmCursor<T> cursor = ((za.co.cporm.model.util.CPOrmCursor<T>) (za.co.cporm.model.loader.CPOrmCursorAdaptor.getCursor()));
    return (cursor != null) && (cursor.moveToPosition(position)) ? cursor.inflate() : null;
}