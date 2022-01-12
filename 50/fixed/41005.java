@java.lang.Override
public int getPositionForSection(int sectionIndex) {
    return (mIndexer) != null ? mIndexer.getPositionForSection(sectionIndex) : 0;
}