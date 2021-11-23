@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    final poker.Card other = ((poker.Card) (obj));
    if ((this.rank) != (other.rank)) {
        return false;
    }
    if (!(java.util.Objects.equals(this.suit, other.suit))) {
        return false;
    }
    return true;
}