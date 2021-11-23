public static boolean is300atTheEnd(java.lang.String text) {
    java.lang.String replacedText = text.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
    return ((((((replacedText.endsWith("300")) || (replacedText.endsWith("иста"))) || (replacedText.endsWith("ista"))) || (replacedText.endsWith("исто"))) || (replacedText.endsWith("isto"))) || (replacedText.endsWith("истер"))) || (replacedText.endsWith("ister"));
}