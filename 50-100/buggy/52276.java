public int afmetingStamboom() {
    int counter = 1;
    if ((ouderlijkGezin) != null) {
        counter += ouderlijkGezin.getOuder1().afmetingStamboom();
        if ((ouderlijkGezin.getOuder2()) != null) {
            ouderlijkGezin.getOuder2().afmetingStamboom();
        }
    }
    return counter;
}