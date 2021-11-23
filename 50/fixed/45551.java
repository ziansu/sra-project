public <T> T fromPath(java.lang.String path, java.lang.Class<T> clazz) {
    return fromDocument(new com.github.onlynight.fastini.IniDocument(path).parse(), clazz);
}