public void editLine(java.lang.String macro, int line, java.lang.String edit) {
    java.util.List<java.lang.String> lines = get(macro);
    line = java.lang.Math.min(line, lines.size());
    if (edit.isEmpty()) {
        if (line < (lines.size())) {
            get(macro).remove(line);
        }
    }else {
        get(macro).set(line, edit);
    }
}