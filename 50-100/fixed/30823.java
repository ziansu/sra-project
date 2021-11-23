private static void getPunkte() {
    for (int i = 0; i < (statistics.Rangliste.Stacks.size()); i++) {
        java.lang.Double[] temp = database.Database.getScore(statistics.Rangliste.Stacks.get(i).toString());
        if (temp != null) {
            statistics.Rangliste.Punkte.add(temp[1]);
        }else {
            continue;
        }
    }
}