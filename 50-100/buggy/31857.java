@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mAdapter.add(0, new com.nulldreams.delegateadapter.adapter.delegate.StatusDelegate(new com.nulldreams.delegateadapter.model.Status(com.nulldreams.delegateadapter.DataManager.getInstance().getMe(), editTv.getText().toString(), true))).autoNotify();
}