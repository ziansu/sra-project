@java.lang.Override
public int compareTo(hu.unideb.snapszer.model.ICard o) {
    hu.unideb.snapszer.model.HungarianCard other = ((hu.unideb.snapszer.model.HungarianCard) (o));
    if ((suit.isTrump()) && (!(other.suit.isTrump()))) {
        return 1;
    }
    if ((suit) == (other.suit)) {
        return rank.compareTo(other.rank);
    }
    return -1;
}