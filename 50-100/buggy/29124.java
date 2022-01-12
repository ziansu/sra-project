@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.searchpeople, null);
    user_instance = new com.teamspeaghetti.www.gifster.interiorapplication.presenters.UserProcesses(getContext(), this);
    registerUserToGIFsterServer();
    rootView = init(rootView);
    getPeopleFromServer();
    return rootView;
}