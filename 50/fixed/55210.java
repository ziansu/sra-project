@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.pquach.vocabularynote.Category.delete(getActivity(), mCategory);
    updateSpinner();
}