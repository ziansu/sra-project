private java.lang.Integer berechneKorrigierteDifferenz(final java.util.List<de.jdufner.watch.tracker.businessobjects.Abweichung> abweichungen) {
    java.util.List<de.jdufner.watch.tracker.businessobjects.Abweichung.Pair> pairs = new java.util.LinkedList<>();
    abweichungen.stream().reduce(( abweichung1, abweichung2) -> {
        pairs.add(new de.jdufner.watch.tracker.businessobjects.Abweichung.Pair(abweichung1, abweichung2));
        return abweichung2;
    });
    return pairs.stream().mapToInt(( pairOfAbweichungen) -> pairOfAbweichungen.berechneKorrigierteDifferenz()).sum();
}