public java.lang.String toString() {
    java.lang.String str = "";
    for (com.levigilad.javaplay.infra.entities.PlayingCard card : _cards) {
        str += ((("(" + (card.getRank())) + ",") + (card.getSuit())) + "),";
    }
    str.substring(0, ((str.length()) - 1));
    return str;
}