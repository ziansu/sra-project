@java.lang.Override
public final void onNext(java.util.List<com.hansjin.mukja_android.Model.Food> response) {
    if (response != null) {
        refresh();
        uiThread_Search(response);
    }else {
        android.widget.Toast.makeText(getActivity(), "검색 결과가 없습니다", Toast.LENGTH_SHORT).show();
    }
}