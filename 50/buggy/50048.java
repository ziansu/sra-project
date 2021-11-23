public void initHeroesBasicsLocally(android.content.Context context) throws java.io.IOException {
    java.io.InputStream inputStream = context.getResources().openRawResource(R.raw.heroesjson);
    initHeroesBasics(inputStream);
}