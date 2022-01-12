public int afmetingStamboom() {
    int counter = 1;
    if ((ouderlijkGezin) != null) {
        if ((ouderlijkGezin.getOuder1()) != null) {
            counter += ouderlijkGezin.getOuder1().afmetingStamboom();
        }
        if ((ouderlijkGezin.getOuder2()) != null) {
            counter += ouderlijkGezin.getOuder2().afmetingStamboom();
        }
    }
    return counter;
}