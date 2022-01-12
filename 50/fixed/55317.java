@java.lang.Override
public void onClick(android.view.View v) {
    com.ofcampus.model.SearchData mSearchData = items.get(position);
    if (mSearchData != null) {
        gotToScreen(mSearchData);
    }
}