public com.gradians.prepwell.dom.Card next() {
    if ((_next) != null)
        return _next;
    
    if (_isChoices)
        return null;
    
    java.util.ArrayList<com.gradians.prepwell.dom.Card> family = _question.getCards();
    int n = family.indexOf(this);
    _next = family.get((n + 1));
    return _next;
}