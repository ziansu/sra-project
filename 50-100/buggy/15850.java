private void displayMenuIcons(boolean display) {
    if (mNotificationActive) {
        mMenu.findItem(R.id.action_notification_active).setVisible(display);
    }else {
        mMenu.findItem(R.id.action_notification_none).setVisible(display);
    }
    mMenu.findItem(R.id.action_export_data).setVisible(display);
    mMenu.findItem(R.id.action_date_range).setVisible(display);
}