private void refreshUIButtons() {
    btnShowFavourites.setBackgroundResource((com.doruchidean.clujbikemap.helpers.PersistenceManager.getShowFavouritesOnly(this) ? R.drawable.ic_favourite : R.drawable.ic_favourites_pressed));
    if (com.doruchidean.clujbikemap.helpers.PersistenceManager.getIsCountingDown(this)) {
        btnTimer.setBackgroundResource(R.drawable.ic_timer_pressed);
    }else {
        btnTimer.setBackgroundResource(R.drawable.ic_timer);
        btnTimer.setText("");
    }
}