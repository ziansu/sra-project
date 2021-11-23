public static void registerTheme(java.lang.String name, com.googlecode.lanterna.graphics.Theme theme) {
    if (theme == null) {
        throw new java.lang.IllegalArgumentException("Name cannot be null");
    }else
        if (name.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Name cannot be empty");
        }
    
    com.googlecode.lanterna.graphics.Theme result = com.googlecode.lanterna.bundle.LanternaThemes.REGISTERED_THEMES.putIfAbsent(name, theme);
    if ((result != null) && (result != theme)) {
        throw new java.lang.IllegalArgumentException((("There is already a theme registered with the name '" + name) + "'"));
    }
}