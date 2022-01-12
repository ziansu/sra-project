public static float getTotalHours(javafx.collections.ObservableList<plainsimple.Session> data) {
    float total = 0.0F;
    for (int i = 0; i < (data.size()); i++) {
        total += data.get(i).getTimePracticed().getHour();
        total += ((float) (data.get(i).getTimePracticed().getMinute())) / 60;
    }
    return total;
}