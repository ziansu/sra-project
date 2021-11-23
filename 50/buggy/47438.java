public static com.ly.badiane.budgetmanager_finalandroidproject.divers.Mois extractMois(java.util.Calendar calendar) {
    int m = calendar.get(java.util.Calendar.MONTH);
    int a = calendar.get(java.util.Calendar.YEAR);
    return new com.ly.badiane.budgetmanager_finalandroidproject.divers.Mois(m, a);
}