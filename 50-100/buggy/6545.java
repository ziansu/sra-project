protected int getNotificationColor(android.content.Context context) {
    try {
        int id = this.getResources().getIdentifier("notification_color", "color", this.getPackageName());
        return this.getResources().getColor(id);
    } catch (android.content.res.Resources.NotFoundException e) {
        return -1;
    }
}