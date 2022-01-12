@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder stringBuffer = new java.lang.StringBuilder("");
    stringBuffer.append(getCardString()).append(" ").append(getCardSuit()).append("");
    return stringBuffer.toString();
}