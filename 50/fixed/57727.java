@java.lang.Override
public void onClick(android.view.View view) {
    if ((mList.size()) > 0) {
        ((com.xlythe.spotifysteamer.MainActivity) (getActivity())).addFragmentPlayer(mList, 0);
    }
}