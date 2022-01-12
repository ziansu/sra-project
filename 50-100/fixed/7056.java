public static FoodItem getFoodItemFromByteArray(char[] tagCode, byte[] bytes) {
    java.lang.String splittableString = new java.lang.String(bytes);
    java.lang.String[] strings = splittableString.split(FoodItem.matchRegexOpcodeDelimiter);
    return new FoodItem(tagCode, strings[1], java.lang.Integer.parseInt(strings[2]));
}