@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        android.util.Log.i(this.getClass().getSimpleName(), ("Topic list" + (topicsList)));
        setListAdapter(new org.worshipsongs.adapter.TitleAdapter<org.worshipsongs.domain.Topics>(getActivity(), topicsList, "topics"));
        org.worshipsongs.utils.CommonUtils.hideKeyboard(getActivity());
    }
}