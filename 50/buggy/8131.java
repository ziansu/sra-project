public java.lang.String getFormattedName(int i) {
    if (i < (inlineNames.length))
        return inlineNames[i];
    
    return templates[((inlineNames.length) + i)].name;
}