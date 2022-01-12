private void getSymbolListFromSharedPreference() {
    java.lang.String jsonScore = sharedPreference.getSymbolList();
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<com.example.ivanradosavljevic.stockquotes.domain.Symbol>>() {    }.getType();
    symbolList = gson.fromJson(jsonScore, type);
    if ((symbolList) != null) {
        myAdapter = new com.example.ivanradosavljevic.stockquotes.logic.MyAdapter(symbolList, getApplicationContext());
        lv.setAdapter(myAdapter);
    }
}