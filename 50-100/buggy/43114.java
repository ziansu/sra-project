public net.eithon.plugin.cop.logic.Profanity add(java.lang.String word) {
    net.eithon.plugin.cop.logic.Profanity profanity = getProfanity(word, net.eithon.plugin.cop.logic.Blacklist.PROFANITY_LEVEL_MAX);
    if (profanity != null) {
        this._eithonPlugin.getEithonLogger().warning("Blacklist.add: Trying to add a word that already exists: \"%s\".", word);
        return profanity;
    }
    profanity = new net.eithon.plugin.cop.logic.Profanity(word);
    add(profanity);
    return profanity;
}