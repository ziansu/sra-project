@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((view) == null) {
        view = inflater.inflate(R.layout.fragment_step, container, false);
        butterknife.ButterKnife.bind(this, view);
    }else {
        android.view.ViewGroup parent = ((android.view.ViewGroup) (view.getParent()));
        if (parent != null) {
            parent.removeView(view);
        }
    }
    return view;
}