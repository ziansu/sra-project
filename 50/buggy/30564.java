@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    intent.setType("image/*");
    getActivity().startActivityForResult(intent, com.example.nobell.project3.ui.FriendAddFragment.EditButtonListener.SELECT_PHOTO);
}