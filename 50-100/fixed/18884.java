public void object() {
    if ((s.getSym()) == (Constant.lcbracket)) {
        s.nextSym();
        if ((s.getSym()) == (Constant.string)) {
            members();
        }
        if ((s.getSym()) == (Constant.rcbracket)) {
            s.nextSym();
        }else {
            error("} expected");
        }
    }else {
        error("{ expected");
    }
}