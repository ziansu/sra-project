public void editLine(java.lang.String macro, int line, java.lang.String edit) {
    java.util.List<java.lang.String> lines = get(macro);
    if (edit.isEmpty()) {
        if (line < (lines.size())) {
            lines.remove(line);
        }
    }else {
        if (line < (lines.size())) {
            lines.set(line, edit);
        }else {
            lines.add(edit);
        }
    }
}