public java.lang.Object executeInContext(final com.orientechnologies.orient.core.command.OCommandContext iContext, final java.util.Map<java.lang.Object, java.lang.Object> iArgs) {
    final java.lang.String language = request.getLanguage();
    parserText = request.getText();
    parameters = iArgs;
    if (language.equalsIgnoreCase("SQL"))
        return executeSQL();
    else
        return executeJsr223Script(language, iContext, iArgs);
    
}