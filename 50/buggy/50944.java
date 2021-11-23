public static void convertSmileys(android.text.Editable input) {
    for (java.lang.String key : org.kontalk.util.MessageUtils.sEmojiConverterMap.keySet()) {
        org.kontalk.util.MessageUtils.replaceEditable(input, key, org.kontalk.util.MessageUtils.sEmojiConverterMap.get(key));
    }
}