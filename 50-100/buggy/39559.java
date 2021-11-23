@java.lang.Override
public void onResponse(com.ablanco.teemo.model.staticdata.ChampionDto response) {
    getSupportActionBar().setTitle(response.getName());
    getSupportActionBar().setSubtitle(response.getTitle());
    com.bumptech.glide.Glide.with(this).load(com.ablanco.teemo.utils.ImageUris.getChampionSplashArt(response.getName(), response.getSkins().get(0).getNum())).into(championSplashImage);
    mChampion = response;
    setUpViewPager();
}