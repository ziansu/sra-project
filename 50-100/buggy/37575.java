public void årligPremie() {
    premie = 0;
    java.util.Iterator<Forsikring> iterator = forsikringer.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().getGyldig().equals(true))
            premie += iterator.next().getPremie();
        
    } 
    if (totalkunde)
        premie *= 0.9;
    
}