void backspace() {
    ru.tesei7.textEditor.editor.document.model.Line currentLine = document.getCurrentLine();
    if ((currentLine.getOffset()) == 0) {
        concatLines(currentLine.getPrevious(), currentLine, true);
    }else {
        currentLine.backspace();
        caretObservable.notifyListeners(new ru.tesei7.textEditor.editor.caret.SyntaxCaretEvent(ru.tesei7.textEditor.editor.caret.SyntaxCaretEventType.MOVED_LEFT));
        dimensionsObservable.notifyListeners(new ru.tesei7.textEditor.editor.scroll.bar.DimensionsEvent(ru.tesei7.textEditor.editor.scroll.bar.DimensionType.ONLY_X));
    }
}