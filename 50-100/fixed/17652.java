public T setStyles(at.pcgamingfreaks.Message.MessageColor... styles) {
    if (styles != null) {
        for (at.pcgamingfreaks.Message.MessageColor style : styles) {
            if (style == null)
                continue;
            
            if (style.isFormat()) {
                setFormats(style);
            }
            if (style.isColor()) {
                setColor(style);
            }
        }
    }
    return ((T) (this));
}