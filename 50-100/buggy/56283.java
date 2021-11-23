@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_recipe);
    java.lang.String[] steps = new java.lang.String[]{ "step 1" , "step 2" , "step 3" , "step 4" , "step 5" , "step 6" , "step 7" , "step 8" , "step 9" , "step 10" };
    android.widget.ListAdapter stepsAdapter = new org.cook_e.cook_e.StepListAdapter(this);
    android.widget.ListView stepsList = ((android.widget.ListView) (findViewById(R.id.recipeSteps)));
    stepsList.setAdapter(stepsAdapter);
}