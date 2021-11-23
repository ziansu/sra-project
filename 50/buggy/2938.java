@java.lang.Override
public nez.bx.FormatGenerator.LinkedInner[] checkInner() {
    nullCheck();
    if (checkedNonterminal.has(this)) {
        return null;
    }
    checkedNonterminal.addElement(this);
    return captured.checkInner();
}