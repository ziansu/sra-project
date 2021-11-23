public com.rit.sucy.config.parse.DataSection defaultSection(java.lang.String key) {
    if (isSection(key))
        return getSection(key);
    else
        return createSection(key);
    
}