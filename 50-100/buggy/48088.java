public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_individuality_page, container, false);
    mContext = getActivity();
    gridview = ((com.scut.joe.unidesktop.container.DragGrid) (view.findViewById(R.id.gradview)));
    ll = ((android.widget.RelativeLayout) (view.findViewById(R.id.ll)));
    setBackground();
    return view;
}