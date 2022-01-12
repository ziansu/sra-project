protected static java.util.List<java.lang.String> optionToList(java.util.Map<java.lang.String, java.lang.String> options, java.lang.String key, boolean replaceAdditionalSeparator) {
    if (options.containsKey(key)) {
        java.lang.String option = options.get(key);
        if (replaceAdditionalSeparator) {
            option = option.replace(org.wikipedia.nirvana.nirvanabot.NirvanaBot.ADDITIONAL_SEPARATOR, org.wikipedia.nirvana.nirvanabot.NirvanaBot.DEPTH_SEPARATOR);
        }
        return org.wikipedia.nirvana.BotUtils.optionToList(option, true);
    }
    return new java.util.ArrayList<>();
}