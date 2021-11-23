@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    if ((state) == (num_ex)) {
        dialog(2);
    }
    load(state);
}