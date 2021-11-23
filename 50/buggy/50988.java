public boolean isEnglish() {
    if (checkLangAttribute())
        return true;
    
    return (checkTitle()) && (checkAllContent());
}