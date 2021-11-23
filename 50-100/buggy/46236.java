private void loadAll() {
    android.util.Log.e(com.dev.town.small.brewtopia.Timer.TimerBoilAdditions.LOG, "Entering: loadAll");
    java.util.List<com.dev.town.small.brewtopia.DataClass.BoilAdditionsSchema> boilAdditionsSchemaList = new java.util.ArrayList<com.dev.town.small.brewtopia.DataClass.BoilAdditionsSchema>();
    boilAdditionsSchemaList.addAll(timerData.getInstance().getAdditionsList());
    com.dev.town.small.brewtopia.Brews.CustomBoilAdditionsAdapter adapter = new com.dev.town.small.brewtopia.Brews.CustomBoilAdditionsAdapter(boilAdditionsSchemaList, getActivity());
    adapter.setEditable(false);
    adapter.setEventHandler(new com.dev.town.small.brewtopia.Brews.CustomBoilAdditionsAdapter.EventHandler() {
        @java.lang.Override
        public void OnEditClick(com.dev.town.small.brewtopia.DataClass.BoilAdditionsSchema aBoilAdditionsSchema) {
        }
    });
    BrewAdditionsListView.setAdapter(adapter);
}