public void saveInstanceState(@android.support.annotation.NonNull
android.os.Bundle outState) {
    outState.putParcelableArrayList(com.proxerme.app.adapter.PagingAdapter.STATE_LIST, list);
}