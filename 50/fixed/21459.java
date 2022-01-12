private static java.lang.String notAvailableCheck(java.lang.String existingDepWar) {
    if (existingDepWar == null) {
        return null;
    }else
        if (existingDepWar.toLowerCase().equals("n/a")) {
            existingDepWar = null;
        }
    
    return existingDepWar;
}