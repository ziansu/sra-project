@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    com.example.microfan.tag_emulation.FragmentObject2.instance = this;
    android.view.View rootView = inflater.inflate(R.layout.write_tag_fragment, container, false);
    mainView = rootView;
    SetDefaultText(rootView);
    SetOnClickListeners(rootView);
    return rootView;
}