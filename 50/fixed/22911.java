void printChar(char c) {
    document.getCurrentLine().printChar(c);
    dimensionsObservable.notifyListeners(new ru.tesei7.textEditor.editor.scroll.bar.DimensionsEvent(ru.tesei7.textEditor.editor.scroll.bar.DimensionType.ONLY_X));
    caretObservable.notifyListeners(new ru.tesei7.textEditor.editor.caret.SyntaxCaretEvent(ru.tesei7.textEditor.editor.caret.SyntaxCaretEventType.MOVED_RIGHT));
}