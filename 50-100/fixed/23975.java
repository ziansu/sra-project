@java.lang.Override
final ST _compile() {
    if (((this.m_selection) == null) || ((this.m_selection.size()) <= 0)) {
        return null;
    }
    return this._shadow(this.m_set, this.m_selection);
}