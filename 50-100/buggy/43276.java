public boolean equals(java.lang.Object o) {
    boolean gelijk = false;
    if (o instanceof model.Cirkel) {
        model.Cirkel cirkel = ((model.Cirkel) (o));
        if (((this.getMiddelPunt()) == (cirkel.getMiddelPunt())) && ((this.getRadius()) == (cirkel.getRadius()))) {
            gelijk = true;
        }
    }
    return gelijk;
}