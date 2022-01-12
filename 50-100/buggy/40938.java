@java.lang.Override
public void onDataChange(com.learn.shruti.ratemyday.DataSnapshot dataSnapshot) {
    for (com.learn.shruti.ratemyday.DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
        com.learn.shruti.ratemyday.Model.Review r = postSnapshot.getValue(com.learn.shruti.ratemyday.Model.Review.class);
        if (r.employeeEmail.equals(userEmail))
            reviewList.add(r);
        
    }
    rvadapter.notifyDataSetChanged();
}