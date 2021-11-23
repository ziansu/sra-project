protected java.lang.Integer getNotificationColor(android.content.Context context) {
    try {
        int id = this.getResources().getIdentifier("notification_color", "color", this.getPackageName());
        if (id == 0) {
            return null;
        }
        return this.getResources().getColor(id);
    } catch (android.content.res.Resources.NotFoundException e) {
        return null;
    }
}