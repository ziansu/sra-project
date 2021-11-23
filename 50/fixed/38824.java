public void bind(com.salesi.coding.entity.ContactEntity entity) {
    mId.setText(java.lang.Integer.toString(entity.ContactID));
    mName.setText((((entity.FirstName) + " ") + (entity.LastName)));
}