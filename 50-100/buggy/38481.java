@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    if (nameEditText.getText().toString().isEmpty()) {
        return ;
    }
    int[] colorsArray = getActivity().getResources().getIntArray(R.array.category_colors);
    mListener.onClickOkCategory(new com.hulkdx.moneymanager.data.model.Category(nameEditText.getText().toString(), colorsArray[com.hulkdx.moneymanager.ui.main.CategoryDialogFragment.catColorsSelectedImageViews]));
}