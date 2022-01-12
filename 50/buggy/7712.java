@java.lang.Override
public void onRefresh() {
    new com.afn.onthego.async.LearnRequest(getActivity(), this).execute();
}