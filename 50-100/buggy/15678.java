@java.lang.Override
public void onItemClicked(android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, java.lang.Object item, android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, android.support.v17.leanback.widget.Row row) {
    org.amahi.anywhere.server.model.ServerFile serverFile = ((org.amahi.anywhere.server.model.ServerFile) (item));
    getFragmentManager().beginTransaction().replace(R.id.playback_controls_fragment_container, buildAudioFragment(serverFile)).commit();
}