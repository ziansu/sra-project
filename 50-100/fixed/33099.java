private void saveTag() {
    tag.setName(nameEdit.getText().toString().trim());
    if ((tag.getId()) == null) {
        tag.setId(("tag" + (java.lang.System.currentTimeMillis())));
    }
    if (!(allTags.contains(tag))) {
        com.example.portable.firebasetests.network.FirebaseUtils.getInstance().addTag(tag);
        finish();
    }else {
        com.example.portable.firebasetests.utils.ToastUtils.showToast("tag allready exists", false);
    }
}