@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.fishfillet.shoal.model.Car c = dataSnapshot.getValue(com.fishfillet.shoal.model.Car.class);
    if (c != null) {
        mTextColor.setText(c.color);
        mTextYear.setText(c.year);
        mTextMake.setText(c.make);
        mTextModel.setText(c.model);
        mTextLicensePlate.setText(c.plate);
    }
}