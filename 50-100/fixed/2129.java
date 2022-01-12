public static abc.music.core.domain.FormatTemplate.Space find(java.lang.String text) {
    for (abc.music.core.domain.FormatTemplate.Space s : abc.music.core.domain.FormatTemplate.Space.values()) {
        if (((text.equalsIgnoreCase(s.getLabel())) || (text.equalsIgnoreCase(s.name()))) || (text.replaceAll("-", "_").equalsIgnoreCase(s.name()))) {
            return s;
        }
    }
    return null;
}