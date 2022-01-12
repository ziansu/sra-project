public net.eithon.plugin.cop.logic.Profanity add(java.lang.String word) {
    java.lang.String normalized = net.eithon.plugin.cop.logic.Profanity.normalize(word);
    if (isWhitelisted(normalized))
        return null;
    
    net.eithon.plugin.cop.logic.Profanity profanity = this._blacklist.getProfanity(normalized, Blacklist.PROFANITY_LEVEL_MAX);
    this._hashMap.put(normalized, profanity);
    return profanity;
}