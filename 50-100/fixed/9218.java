@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_wanderers, container, false);
    mContainer = v.findViewById(R.id.list_container);
    mProgress = v.findViewById(R.id.list_progress);
    com.codeground.wanderlustbulgaria.Fragments.WanderersFragment.user = com.parse.ParseUser.getCurrentUser();
    return v;
}