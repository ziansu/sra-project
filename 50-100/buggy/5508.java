@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    layoutInflater = ((android.view.LayoutInflater) (getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    android.view.View view = layoutInflater.inflate(layouts[position], container, false);
    container.addView(view);
    android.util.Log.i(org.catrobat.paintroid.WelcomeActivity.TAG, ("init " + position));
    if ((layouts[position]) == (R.layout.islide_possibilities)) {
        createPossibilitiesSequence();
    }
    return view;
}