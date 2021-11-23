private static boolean isUnifierJustARenaming(de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.TTSubstitution sub, de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.TermTuple tt1, de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.TermTuple tt2) {
    if ((sub.apply(tt1).getFreeVars().size()) != (tt1.getFreeVars().size()))
        return false;
    
    if ((sub.apply(tt2).getFreeVars().size()) != (tt2.getFreeVars().size()))
        return false;
    
    return true;
}