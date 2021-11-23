public com.gradians.prepwell.dom.Card next() {
    if ((_next) != null)
        return _next;
    
    if (_isChoices)
        return null;
    
    java.util.ArrayList<com.gradians.prepwell.dom.Card> family = _question.getCards();
    int size = family.size();
    int n = family.indexOf(this);
    _next = (n < (size - 1)) ? family.get((n + 1)) : null;
    return _next;
}