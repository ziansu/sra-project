public void bind(com.salesi.coding.entity.ContactEntity entity) {
    mId.setText(entity.ContactID);
    mName.setText((((entity.FirstName) + " ") + (entity.LastName)));
}