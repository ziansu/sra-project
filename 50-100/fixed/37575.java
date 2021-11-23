public void årligPremie() {
    premie = 0;
    java.util.Iterator<Forsikring> iterator = forsikringer.iterator();
    while (iterator.hasNext()) {
        premie += iterator.next().getPremie();
    } 
    if (totalkunde)
        premie *= 0.9;
    
}