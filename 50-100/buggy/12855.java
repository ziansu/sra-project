@java.lang.Override
public void setLanguage(com.pratilipi.common.type.Language language) {
    switch (language) {
        case HINDI :
            languageId = 5130467284090880L;
            break;
        case GUJARATI :
            languageId = 5965057007550464L;
            break;
        case TAMIL :
            languageId = 6319546696728576L;
            break;
        case MARATHI :
            languageId = 5173513199550464L;
            break;
        case MALAYALAM :
            languageId = 5752669171875840L;
            break;
        case BENGALI :
            languageId = 6235363433512960L;
            break;
        case ENGLISH :
            languageId = 6213615354904576L;
            break;
    }
    this.language = language;
}