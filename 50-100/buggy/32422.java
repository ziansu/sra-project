@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.path_page, container);
    pathScreen = ((com.thoughtworks.mobile.awayday.screen.PathScreen) (rootView.findViewById(R.id.path_screen)));
    initPath();
    return rootView;
}