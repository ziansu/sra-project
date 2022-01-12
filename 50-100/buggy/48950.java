@java.lang.Override
public void onClick(android.view.View v) {
    int pos = ((java.lang.Integer) (v.getTag()));
    selPosition = pos;
    java.lang.String subCate = viewHolder.tvSubCateName.getText().toString();
    selSubCategory = subCate;
    selCategory = selCat;
    if (viewHolder.tvSubCateName.getText().toString().equalsIgnoreCase("Profile photo")) {
        dialogSelectImg.show();
    }else {
        com.idbi.idbi.ui.fragments.ComplianceWithAMLFragment.isProfileSelected = false;
        if (isSdCardPermission) {
            selectImageOptionsDialog();
        }
    }
}