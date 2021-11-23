@java.lang.Override
protected void onPostExecute(java.lang.String heroesJson) {
    if (heroesJson == null) {
        return ;
    }
    final java.lang.String funcname = "[FetchDotaHeroesTask:onPostExecute]";
    super.onPostExecute(heroesJson);
    java.lang.String[] heroes = null;
    android.util.Log.v(classname, heroesJson);
    try {
        heroes = com.example.android.sunshine.app.DotaApiParser.getHeroes(heroesJson);
    } catch (org.json.JSONException ex) {
    }
    dotaHeroesAdaptor.clear();
    for (java.lang.String hero : heroes) {
        dotaHeroesAdaptor.add(hero);
    }
}