@java.lang.Override
public boolean removeAll(java.util.Collection<?> otherCollection) {
    boolean _are_some_removing = true;
    for (java.lang.Object _element : otherCollection) {
        _are_some_removing &= this.remove(_element);
    }
    return _are_some_removing;
}