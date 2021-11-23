@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mMusicItemAdapter = new com.ape.transfer.adapter.FileItemAdapter(getContext(), mFileCategory, this);
    recyclerView.setLayoutManager(getLayoutManager());
    recyclerView.setAdapter(mMusicItemAdapter);
    loadData();
}