@java.lang.Override
public void onClick(android.view.View v) {
    com.ofcampus.model.SearchData mSearchData = items.get(java.lang.Integer.parseInt(v.getTag().toString()));
    if (mSearchData != null) {
        gotToScreen(mSearchData);
    }
}