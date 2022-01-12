private boolean unifiesNamespace(jason.asSyntax.Literal t1s, jason.asSyntax.Literal t2s) {
    if ((t1s == (jason.asSyntax.Literal.DefaultNS)) && (t2s == (jason.asSyntax.Literal.DefaultNS)))
        return true;
    
    t1s = t1s.getNS();
    t2s = t2s.getNS();
    if (t1s.equals(t2s))
        return true;
    
    return unifiesNoUndo(t1s, t2s);
}