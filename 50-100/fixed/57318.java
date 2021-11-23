private void editPerson() {
    com.xi_zz.randomnamepicker.Person temp = com.xi_zz.randomnamepicker.Util.sPeople.get(mPerson);
    temp.name = mNameText.getText().toString();
    temp.photo = ((mBitmap) == null) ? temp.photo : com.xi_zz.randomnamepicker.Util.bitmapToByteString(mBitmap);
    mPeopleRef.setValue(com.xi_zz.randomnamepicker.Util.sPeople);
}