@java.lang.Override
public nez.bx.FormatGenerator.LinkedInner[] checkInner() {
    nullCheck();
    if (checkedNonterminal[id]) {
        return null;
    }
    checkedNonterminal[id] = true;
    return captured.checkInner();
}