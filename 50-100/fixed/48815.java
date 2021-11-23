@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    com.example.neha.appsdontlie_capstonestage2.data.MyProfileData listOfData = dataSnapshot.getValue(com.example.neha.appsdontlie_capstonestage2.data.MyProfileData.class);
    ((com.example.neha.appsdontlie_capstonestage2.MainActivity) (activity)).setListData(listOfData);
    if (dataSnapshot.getKey().equals(com.example.neha.appsdontlie_capstonestage2.presenter.DataPresenter.pushID)) {
        com.example.neha.appsdontlie_capstonestage2.data.MyProfileData readData = dataSnapshot.getValue(com.example.neha.appsdontlie_capstonestage2.data.MyProfileData.class);
        ((com.example.neha.appsdontlie_capstonestage2.MainActivity) (activity)).readData(readData);
    }
}