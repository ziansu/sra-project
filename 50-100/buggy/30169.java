public boolean equals(java.lang.Object object) {
    if (object instanceof model.Rechthoek) {
        model.Rechthoek rechthoek = ((model.Rechthoek) (object));
        if ((((rechthoek.getBreedte()) == (getBreedte())) && ((rechthoek.getHoogte()) == (getHoogte()))) && ((rechthoek.getLinkerBovenhoek()) == (getLinkerBovenhoek()))) {
            return true;
        }
    }
    return false;
}