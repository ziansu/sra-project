public static abc.music.core.domain.Modifier.Clef find(java.lang.String text) {
    if (text != null) {
        if (text.isEmpty()) {
            return abc.music.core.domain.Modifier.Clef.TREBLE;
        }
        for (abc.music.core.domain.Modifier.Clef clef : abc.music.core.domain.Modifier.Clef.values()) {
            if ((text.equalsIgnoreCase(clef.name())) || (text.equalsIgnoreCase(clef.toString()))) {
                return clef;
            }
        }
    }
    return abc.music.core.domain.Modifier.Clef.DEFAULT_CLEF;
}