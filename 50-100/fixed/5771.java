@java.lang.Override
public int getChildrenCount(int groupPosition) {
    if ((this._listDataChild.get(this._listDataHeader.get(groupPosition))) == null) {
        return 0;
    }
    return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
}