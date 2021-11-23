public void unlock(java.lang.String theme) {
    if (!(unlockedThemes.contains(theme))) {
        unlockedThemes.add(theme);
        saveTheme(theme, 0);
    }
}