@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    if (resultCode == 1337) {
        com.example.ffrae_000.memo.TextMemo memo = ((com.example.ffrae_000.memo.TextMemo) (intent.getSerializableExtra("TextMemo")));
        memos.set(memo.getId(), memo);
        saveAll();
        rebuildLayout();
    }
}