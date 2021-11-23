@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    super.onPositive(dialog);
    com.eseo.allmytvshows.managers.TvShowService tvShowService = new com.eseo.allmytvshows.managers.TvShowService(ctx, contents.get(i));
    tvShowService.getDataTVShow();
}