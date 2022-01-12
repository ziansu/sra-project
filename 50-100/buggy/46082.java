@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.f2prateek.dart.Dart.inject(this);
    twoPaneLayout = (detailLayout) != null;
    configureToolbar(true, recipe.getName());
    configureIngredientsViews();
    configureStepsViews((savedInstanceState == null));
}