public java.lang.String toString() {
    java.lang.String str = "";
    for (com.levigilad.javaplay.infra.entities.PlayingCard card : _cards) {
        str += ((("(" + (card.getRank())) + ",") + (card.getSuit())) + "),";
    }
    if ((str.length()) > 0) {
        str = str.substring(0, ((str.length()) - 1));
    }
    return str;
}