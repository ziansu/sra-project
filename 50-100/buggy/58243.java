private void init() {
    int id = ((int) (getIntent().getExtras().get("id")));
    database = new com.example.vromia.healthadvisor.Data.Database(this);
    item = database.getESubstanceItemById(id);
    adapter = new com.example.vromia.healthadvisor.Activities.ESubstanceActivity.ImageAdapter(this);
    adapter.updateIcons(item.getCategories());
    gridView.setAdapter(adapter);
    effectsAdapter = new com.example.vromia.healthadvisor.Activities.ESubstanceActivity.SideEffectsAdapter(this, R.layout.list_row_side_effect, item.getSideEffects());
    sideEffects.setAdapter(effectsAdapter);
}