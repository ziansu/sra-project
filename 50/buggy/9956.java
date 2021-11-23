@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    presenter.onClickDelete(originalURL);
    dismiss();
}