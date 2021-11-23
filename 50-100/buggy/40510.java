private static java.util.ArrayList<java.lang.Double> getPunkte() {
    for (int i = 0; i < (statistics.Diagramm.Stacks.size()); i++) {
        java.lang.Double[] temp = database.Database.getScore(statistics.Diagramm.Stacks.get(i).toString());
        java.lang.Double result = (100 / (temp[0])) * (temp[1]);
        debug.Debugger.out(("Resultat : " + result));
        statistics.Diagramm.Punkte.add(result);
    }
    return statistics.Diagramm.Punkte;
}