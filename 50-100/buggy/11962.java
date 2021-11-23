@java.lang.Override
public void onDataChange(com.learn.shruti.ratemyday.DataSnapshot dataSnapshot) {
    for (com.learn.shruti.ratemyday.DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
        com.learn.shruti.ratemyday.Model.Review r = postSnapshot.getValue(com.learn.shruti.ratemyday.Model.Review.class);
        if ((r.employeeEmail) == userEmail)
            reviewList.add(r);
        
        android.widget.Toast.makeText(this, ((("com: " + (r.comments)) + ", rate ") + (r.rating)), Toast.LENGTH_SHORT).show();
    }
}