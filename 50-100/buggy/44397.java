protected ru.urururu.sanity.api.cfg.SourceRange getSourceRange(java.lang.String filename, int line) {
    java.io.File file = new java.io.File(filename);
    if (!(file.exists())) {
        return null;
    }
    ru.urururu.util.Coverage.markAsCode(file, (line - 1));
    return new ru.urururu.sanity.api.cfg.SourceRange(file, line);
}