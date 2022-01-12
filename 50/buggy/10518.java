@java.lang.Override
public void onHandle() {
    getActivity().startActivity(new android.content.Intent(getActivity(), com.d.dmusic.mvp.activity.HandleActivity.class));
}