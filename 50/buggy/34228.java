@java.lang.Override
public void onCompleted(com.facebook.model.GraphUser user, com.facebook.Response response) {
    if (user != null) {
        java.lang.System.out.println(("onSessionStateChange: LoadNotes: session is open. username:" + (user.getName())));
        loadNotes(getActivity(), getLoggedInUsername());
    }
}