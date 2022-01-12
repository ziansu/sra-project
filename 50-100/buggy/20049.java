private org.apache.logging.log4j.core.pattern.MessageRenderer loadMessageRenderer(java.lang.String[] options) {
    if (((formats) != null) && ((formats.length) == 0)) {
        return null;
    }
    final java.lang.String format = formats[0].toUpperCase(java.util.Locale.ROOT);
    switch (format) {
        case "ANSI" :
            return new org.apache.logging.log4j.core.pattern.JAnsiMessageRenderer(formats);
        case "HTML" :
            return new org.apache.logging.log4j.core.pattern.HtmlMessageRenderer(formats);
    }
    return null;
}