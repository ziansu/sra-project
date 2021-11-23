public treinsimulator.Trein geefEersteTrein(int tijd) {
    for (int vertrek : treinen.keySet()) {
        if ((treinsimulator.Klok.incrementeer(vertrek, tijd)) >= (treinsimulator.Klok.getTijd())) {
            return treinen.get(vertrek);
        }
    }
    return null;
}