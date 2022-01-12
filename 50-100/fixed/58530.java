public void deleteWaterById(android.content.Context context, long rowId, java.lang.String date) {
    com.underdog.hydrate.database.HydrateDAO.getInstance().deleteWaterById(rowId, context);
    if (!(com.underdog.hydrate.util.DateUtil.getInstance().isToday(date))) {
        com.underdog.hydrate.database.HydrateDAO.getInstance().updateTargetStatus(context, com.underdog.hydrate.util.DateUtil.getInstance().getTimeFromDate(date), false);
    }
}