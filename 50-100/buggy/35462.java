public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.page_yoga, container, false);
    btnYoga = ((android.widget.Button) (findViewById(R.id.btnYoga)));
    btnYoga.setOnClickListener(this);
    return rootView;
}