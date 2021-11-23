public int sectionedPositionToPosition(int sectionedPosition) {
    if (isSectionHeaderPosition(sectionedPosition)) {
        return android.support.v7.widget.RecyclerView.NO_POSITION;
    }
    int offset = 0;
    for (int i = 0; i < (mSections.size()); i++) {
        if ((mSections.valueAt(i).sectionedPosition) > sectionedPosition) {
            break;
        }
        --offset;
    }
    return sectionedPosition + offset;
}