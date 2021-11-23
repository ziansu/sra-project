public void loadDummyData() {
    if ((getCount()) == 0) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.util.Random random = new java.util.Random();
        for (int i = 1; i < 20; i++) {
            cal.set(2015, 4, i);
            bo = new com.umb.cs682.projectlupus.domain.MoodLevelBO(null, 1, com.umb.cs682.projectlupus.util.DateTimeUtil.toDate(new java.util.Date(cal.getTimeInMillis())), random.nextInt(6));
            moodLevelDao.insert(bo);
        }
    }
}