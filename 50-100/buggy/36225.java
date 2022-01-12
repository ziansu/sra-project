@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    smartSystems.com.bloodBank.Model.User user = dataSnapshot.getValue(smartSystems.com.bloodBank.Model.User.class);
    smartSystems.com.bloodBank.Activities.DetailActivity.userName = user.getUsername();
    smartSystems.com.bloodBank.Activities.DetailActivity.bloodType = user.getBloodType();
    smartSystems.com.bloodBank.Activities.DetailActivity.phone = user.getPhone();
    smartSystems.com.bloodBank.Activities.DetailActivity.address = user.getAddress();
    tvBloodType.setText(("You selected blood type: " + (smartSystems.com.bloodBank.Activities.DetailActivity.bloodType)));
    tvUsername.setText(smartSystems.com.bloodBank.Activities.DetailActivity.userName);
    tvAddress.setText(smartSystems.com.bloodBank.Activities.DetailActivity.address);
    tvPhone.setText(smartSystems.com.bloodBank.Activities.DetailActivity.phone);
    progressDialog.dismiss();
}