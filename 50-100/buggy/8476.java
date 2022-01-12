private boolean matchRange() {
    if ((((src.charAt(((si) + 1))) == '-') && (((si) + 2) < (sn))) && ((src.charAt(((si) + 2))) != ']')) {
        si += 3;
        return true;
    }else
        return false;
    
}