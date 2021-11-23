@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot.exists()) {
        appByCustomer.setVisibility(View.VISIBLE);
        com.example.rajk.leasingmanagers.model.Quotation quotation = dataSnapshot.getValue(com.example.rajk.leasingmanagers.model.Quotation.class);
        appByCustomer.setText((" " + (quotation.getApprovedByCust())));
        uploadStatus.setText(" Yes");
    }else {
        appByCustomer.setVisibility(View.GONE);
        uploadStatus.setText(" No");
    }
}