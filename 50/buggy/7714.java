private android.view.View createView(android.view.ViewGroup parent) {
    android.view.LayoutInflater layoutInflater = ((android.view.LayoutInflater) (getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    android.view.View view = layoutInflater.inflate(layout, parent, false);
    return view;
}