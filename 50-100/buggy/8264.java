private boolean unifiesNamespace(jason.asSyntax.Literal t1s, jason.asSyntax.Literal t2s) {
    if ((t1s == (jason.asSyntax.Literal.DefaultNS)) && (t2s == (jason.asSyntax.Literal.DefaultNS))) {
        return true;
    }
    jason.asSyntax.Atom nst1 = (t1s == (jason.asSyntax.Literal.DefaultNS)) ? jason.asSyntax.Literal.DefaultNS : t1s.getNS();
    jason.asSyntax.Atom nst2 = (t2s == (jason.asSyntax.Literal.DefaultNS)) ? jason.asSyntax.Literal.DefaultNS : t2s.getNS();
    return unifiesNoUndo(nst1, nst2);
}