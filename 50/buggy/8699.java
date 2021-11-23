public void updateFavouriteOfferts(java.lang.String id) {
    com.example.wojciech.groupon.DbUtils.UpdateFavouritesDatabaseAsyncTask bat = new com.example.wojciech.groupon.DbUtils.UpdateFavouritesDatabaseAsyncTask(mContext);
    bat.execute(id);
    updateEvents();
}