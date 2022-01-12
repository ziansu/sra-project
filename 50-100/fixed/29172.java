@org.jetbrains.annotations.Nullable
private static java.lang.CharSequence getRangeContent(@org.jetbrains.annotations.NotNull
com.intellij.diff.fragments.MergeLineFragment fragment, @org.jetbrains.annotations.NotNull
java.util.List<com.intellij.openapi.editor.ex.EditorEx> editors, @org.jetbrains.annotations.NotNull
com.intellij.diff.tools.simple.ThreeSide side) {
    com.intellij.openapi.editor.ex.DocumentEx document = side.select(editors).getDocument();
    int line1 = fragment.getStartLine(side);
    int line2 = fragment.getEndLine(side);
    if (line1 == line2)
        return null;
    
    return com.intellij.diff.tools.simple.DiffUtil.getLinesContent(document, line1, line2);
}