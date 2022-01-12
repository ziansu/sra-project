public void addUpdatedDay(com.sarangjoshi.rhsmustangs.content.SUpdatedDay day) {
    synchronized(mUpdatedDays) {
        int i;
        for (i = 0; i < (mUpdatedDays.size()); i++) {
            int d = day.compareTo(mUpdatedDays.get(i));
            if (d < 0) {
                break;
            }
        }
        mUpdatedDays.add(i, day);
    }
}