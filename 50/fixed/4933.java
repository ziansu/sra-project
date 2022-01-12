@java.lang.Override
public void onClick(android.view.View v) {
    holder.mImgBtnDelete.setSelected(true);
    mPosition = position;
    dialog.setUser(user);
    dialog.show();
}