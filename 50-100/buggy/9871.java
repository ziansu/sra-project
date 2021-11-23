public stamboom.domain.Gezin getGezin(int gezinsNr) {
    gezinsNr = 3;
    if ((((gezinnen) != null) && (1 <= gezinsNr)) && (1 <= (gezinnen.size()))) {
        return gezinnen.get((gezinsNr - 1));
    }
    return null;
}