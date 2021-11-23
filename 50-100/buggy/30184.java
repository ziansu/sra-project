@java.lang.Override
public void onSearchableItemClicked(java.lang.Object item, int position) {
    setSelection(_items.indexOf(item));
    if (!(_isDirty)) {
        setAdapter(_arrayAdapter);
        setSelection(_items.indexOf(item));
        _isDirty = true;
    }
}