public void verwijder(Exercise08.Opdracht2.Artikel a) {
    for (int i = 0; i < (winkelwagen.size()); i++) {
        if ((winkelwagen.get(i).getClass()) == (a.getClass())) {
            winkelwagen.remove(i);
        }
    }
}