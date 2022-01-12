@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    super.onPositive(dialog);
    final com.eseo.allmytvshows.model.realm.RealmTvShow realmTvShow = iTvShowDao.findByName(contents.get(i).getOriginal_name());
    if (realmTvShow != null) {
        final long idRealmTvShow = realmTvShow.getId();
        iTvShowDao.remove(realmTvShow);
        com.eseo.allmytvshows.managers.TvShowApplication.getBus().post(new com.eseo.allmytvshows.model.Data(com.eseo.allmytvshows.model.Data.REFRESH_ALL_DATA_MY_SHOWS_ADAPTER, idRealmTvShow));
    }
}