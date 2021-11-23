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
    if (!(this.suit.equals(other.suit))) {
        return false;
    }
    return true;
}