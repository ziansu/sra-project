@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mId = getArguments().getInt("mensaId");
    position = getArguments().getInt("position");
    meals = this.getMeals(position, mId);
    if ((meals) == null)
        meals = new java.util.ArrayList<>();
    
    this.setListAdapter(new com.pasta.mensadd.util.MealListAdapter(getActivity().getApplicationContext(), meals));
}