parser.Options.PossibleLang findLang(java.lang.String file) {
    for (parser.Options.PossibleLang lang : parser.Options.PossibleLang.values())
        if ((lang != (parser.Options.PossibleLang.Unknown)) && ((file.indexOf(parser.Options.langString[lang.ordinal()])) != (-1))) {
            return lang;
        }
    
    java.lang.System.out.println("Warning: unknow language");
    return parser.Options.PossibleLang.Unknown;
}