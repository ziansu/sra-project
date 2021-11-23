public static se.simjarr.global.Currency fromValue(int value) {
    return se.simjarr.global.Currency.values()[(value - 1)];
}