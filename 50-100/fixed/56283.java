@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_recipe);
    android.widget.ListAdapter stepsAdapter = new org.cook_e.cook_e.StepListAdapter(this);
    android.widget.ListView stepsList = ((android.widget.ListView) (findViewById(R.id.recipeSteps)));
    stepsList.setAdapter(stepsAdapter);
}