@java.lang.Override
public boolean onLongClick(android.view.View view) {
    mDialog = new com.example.administrator.project_1___to_do_list.DeleteDialog(view.getContext(), new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            mList.removeToDoItem(position);
            notifyItemRemoved(position);
        }
    }, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
        }
    });
    mDialog.show();
    return true;
}