@java.lang.Override
public int compareTo(Card c) {
    int result = (this.rank()) - (c.rank());
    if (result == 0) {
        result = (this.suit()) - (c.suit());
    }
    return result;
}