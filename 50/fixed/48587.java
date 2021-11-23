public void unlock(java.lang.String theme) {
    if (!(unlockedThemes.contains(theme))) {
        saveTheme(theme, 0);
        unlockedThemes.add(theme);
    }
}