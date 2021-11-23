@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    deleteTask = new com.bookstore.booklist.CategoryBookListFragment.DeteleSelectedBooksTask(mode);
    deleteTask.execute();
}