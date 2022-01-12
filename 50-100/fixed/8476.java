private boolean matchRange() {
    if (((((si) + 2) < (sn)) && ((src.charAt(((si) + 1))) == '-')) && ((src.charAt(((si) + 2))) != ']')) {
        si += 3;
        return true;
    }else
        return false;
    
}