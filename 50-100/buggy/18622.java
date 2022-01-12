public static void coinPaySave(java.lang.Boolean isSave, int amount) {
    if (isSave) {
        com.edge.work.travelbox.StatusFragment.startCountAnimation(com.edge.work.travelbox.StatusFragment.coin, amount);
        TravelBox.coin += amount;
        com.edge.work.travelbox.StatusFragment.DoSync doSync = new com.edge.work.travelbox.StatusFragment.DoSync();
        doSync.execute("");
    }else {
        com.edge.work.travelbox.StatusFragment.startCountAnimation(com.edge.work.travelbox.StatusFragment.coin, (-amount));
        TravelBox.coin -= amount;
        com.edge.work.travelbox.StatusFragment.DoSync doSync = new com.edge.work.travelbox.StatusFragment.DoSync();
        doSync.execute("");
    }
}