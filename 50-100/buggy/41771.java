@java.lang.Override
public void onClick(android.view.View view) {
    mDialog = new com.example.administrator.project_1___to_do_list.DeleteDialog(view.getContext(), new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            mListHolder.remove(position);
            finish();
        }
    }, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
        }
    });
    mDialog.show();
}