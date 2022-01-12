@java.lang.Override
public void onClick(android.view.View arg0) {
    editor.putString("OperatingMode", str[position1]);
    editor.commit();
    android.content.Intent wordIntent = new android.content.Intent(getActivity(), hult.netlab.pku.apmpowermanager.ModeEdit.class);
    getActivity().startActivityForResult(wordIntent, 1);
    editDialog.dismiss();
}