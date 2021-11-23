private java.lang.String urlBuilder(java.lang.String[] args) {
    java.lang.String terms = "";
    for (int i = 0; i < (args.length); i++) {
        terms += args[i];
        if (i != ((args.length) - 1))
            terms += "+";
        
    }
    return (((apiUrl) + terms) + ".json") + (accesToken);
}