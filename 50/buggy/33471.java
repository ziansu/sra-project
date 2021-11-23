public static model.Language getLanguage(java.lang.String lang) {
    switch (lang) {
        case "Java" :
            return model.Language.JAVA;
        case "Ruby" :
            return model.Language.RUBY;
        case "Python" :
            return model.Language.PYTHON;
        default :
            return model.Language.OTHER;
    }
}