private java.lang.String convertToString(int amount) {
    java.lang.String str = "";
    int hundredThousand = amount / 100000000;
    if (hundredThousand >= 1) {
        str += hundredThousand + "억";
        amount -= hundredThousand * 100000000;
    }
    int tenThousand = amount / 10000;
    if (tenThousand >= 1) {
        str += tenThousand + "만";
        amount -= hundredThousand * 10000;
    }
    str += amount;
    return str;
}