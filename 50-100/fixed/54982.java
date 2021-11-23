private static java.util.List<java.lang.String> optionToList(java.util.Map<java.lang.String, java.lang.String> options, java.lang.String key) {
    if (options.containsKey(key)) {
        return org.wikipedia.nirvana.BotUtils.optionToList(options.get(key), false);
    }
    return new java.util.ArrayList<>();
}