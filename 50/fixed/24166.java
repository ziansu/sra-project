@java.lang.Override
protected void addFullText(lu.fisch.structorizer.elements.StringList _lines, boolean _instructionsOnly) {
    _lines.add(this.getText());
    this.q.addFullText(_lines, _instructionsOnly);
}