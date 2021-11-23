@java.lang.Override
public void onClick(android.view.View v) {
    new com.verizon.mvyas.verizonproject.TagListActivity.LoadDataTask().execute(context);
    adapter.resetSelectedTags();
}