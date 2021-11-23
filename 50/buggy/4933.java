@java.lang.Override
public void onClick(android.view.View v) {
    user.setIsDelete(true);
    holder.mImgBtnDelete.setSelected(true);
    mPosition = position;
    dialog.show();
    dialog.setUser(user);
}