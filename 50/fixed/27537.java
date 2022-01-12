private boolean contains(eg.edu.guc.rolltheball.logic.grammer.Clause c) {
    for (eg.edu.guc.rolltheball.logic.grammer.Clause clause : formula)
        if ((clause.toString().equals(c.toString())) || (c.equals(clause)))
            return true;
        
    
    return false;
}