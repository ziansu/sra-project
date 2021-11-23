public void updateWaterById(android.content.Context context, long rowId, long timestamp, double quantity, java.lang.String date) {
    com.underdog.hydrate.database.HydrateDAO.getInstance().updateEvent(rowId, timestamp, quantity, context);
    if (!(com.underdog.hydrate.util.DateUtil.getInstance().isToday(date))) {
        com.underdog.hydrate.database.HydrateDAO.getInstance().updateTargetStatus(context, com.underdog.hydrate.util.DateUtil.getInstance().getTimeFromDate(date));
    }
}