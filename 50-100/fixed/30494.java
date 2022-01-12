@java.lang.Override
public int compareTo(Card c) {
    int result = (this.suit()) - (c.suit());
    if (result == 0) {
        result = (this.rank()) - (c.rank());
    }
    return result;
}