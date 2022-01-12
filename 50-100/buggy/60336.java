public void updateDescription(io.realm.Realm realm) {
    com.ivart.makedecision.Model.DecisionDescription toEdit = realm.where(com.ivart.makedecision.Model.DecisionDescription.class).equalTo("id", descriptionId).findFirst();
    realm.beginTransaction();
    toEdit.setDescriptionText(editTextDescription.getText().toString());
    toEdit.setRaiting(editRaitBar.getRating());
    realm.commitTransaction();
}