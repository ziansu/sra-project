@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    return (compareTo(((net.sourceforge.subsonic.domain.MusicIndex.SortableArtist) (o)))) == 0;
}