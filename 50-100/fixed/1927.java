@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_recipe);
    butterknife.ButterKnife.bind(this);
    ingredientList = new java.util.ArrayList<java.lang.String>();
    mAddInstructionsButton.setOnClickListener(this);
    mAddIngredientButton.setOnClickListener(this);
    adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, ingredientList);
    mListView.setAdapter(adapter);
}