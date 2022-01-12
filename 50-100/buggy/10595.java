@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    mProfile = dataSnapshot.getValue(mobi.devteam.demofalldetector.model.Profile.class);
    age = mProfile.getAge();
    bmi = (mProfile.getWeight()) / (java.lang.Math.sqrt(mProfile.getHeight()));
    isMale = mProfile.isMale();
    threshold_1 = mProfile.getThresh1();
    threshold_2 = mProfile.getThresh2();
    threshold_3 = mProfile.getThresh3();
    add_threshold_value();
}