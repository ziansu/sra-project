@java.lang.Override
final ST _compile() {
    final int size;
    if (((this.m_selection) == null) || ((size = this.m_selection.size()) <= 0)) {
        return null;
    }
    if ((this.m_set.getData().size()) <= size) {
        return this.m_set;
    }
    return this._shadow(this.m_set, this.m_selection);
}