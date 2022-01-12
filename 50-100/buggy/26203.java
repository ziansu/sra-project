@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    net.sourceforge.subsonic.domain.MusicIndex.SortableArtist artist = ((net.sourceforge.subsonic.domain.MusicIndex.SortableArtist) (o));
    return sortableName.equalsIgnoreCase(artist.sortableName);
}