public java.util.List<draft.Pick> get(draft.Hero hero, boolean withOrAgainst) {
    if (withOrAgainst)
        return new java.util.ArrayList(synergyPicks.get(hero));
    else
        return new java.util.ArrayList(versusPicks.get(hero));
    
}