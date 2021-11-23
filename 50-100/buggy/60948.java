@java.lang.SuppressWarnings(value = "unchecked")
void addAdapter(int position, com.raizlabs.universaladapter.converter.UniversalAdapter adapter) {
    int count = getCount();
    com.raizlabs.universaladapter.converter.MergedUniversalAdapter.ListPiece piece = new com.raizlabs.universaladapter.converter.MergedUniversalAdapter.ListPiece(adapter, this);
    piece.adapter.getListObserver().addListener(cascadingListObserver);
    listPieces.add(position, piece);
    piece.setStartPosition(count);
    piece.initializeItemViewTypes();
}