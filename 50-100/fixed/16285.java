public void addWater(android.content.Context context, java.lang.String date, java.lang.String quantity) {
    if (com.underdog.hydrate.util.DateUtil.getInstance().isToday(date)) {
        com.underdog.hydrate.database.HydrateDAO.getInstance().addWater(java.lang.System.currentTimeMillis(), quantity, context);
    }else {
        com.underdog.hydrate.database.HydrateDAO.getInstance().addWater(com.underdog.hydrate.util.DateUtil.getInstance().getThisTimeThatDay(date), quantity, context);
        com.underdog.hydrate.database.HydrateDAO.getInstance().updateTargetStatus(context, com.underdog.hydrate.util.DateUtil.getInstance().getTimeFromDate(date), false);
    }
}