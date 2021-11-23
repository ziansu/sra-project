public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    this.inflater = inflater;
    android.view.View v = this.inflater.inflate(R.layout.fragment_art, container, false);
    this.findViews(v);
    this.update(curArticle);
    return v;
}