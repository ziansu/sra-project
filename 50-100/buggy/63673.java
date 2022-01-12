@java.lang.Override
public void onCopyToEditCacheCompiled(int result) {
    if (result == (CopyDiaryToEditCacheTask.RESULT_COPY_SUCCESSFUL)) {
        PB_diary_item_content_hint.setVisibility(View.GONE);
        initData();
        IV_diary_clear.setOnClickListener(this);
        IV_diary_save.setOnClickListener(this);
    }else {
        dismissAllowingStateLoss();
    }
    initHandlerOrTaskIsRunning = false;
}