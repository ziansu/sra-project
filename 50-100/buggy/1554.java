public static double getTotalHours(javafx.collections.ObservableList<plainsimple.Session> data) {
    double total = 0.0;
    for (int i = 0; i < (data.size()); i++) {
        total += data.get(i).getTimePracticed().getHour();
        java.lang.System.out.println(("Total = " + total));
        total += (data.get(i).getTimePracticed().getMinute()) / 60;
        java.lang.System.out.println(("Total = " + total));
    }
    return total;
}