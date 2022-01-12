public boolean setSelected(T t, boolean selected) {
    return setSelected(t.hashCode(), selected);
}