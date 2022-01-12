@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if (dataSnapshot != null) {
        for (com.firebase.client.DataSnapshot singleObject : dataSnapshot.getChildren()) {
            edu.uw.nmcgov.recommendme.UserObject userObject = singleObject.getValue(edu.uw.nmcgov.recommendme.UserObject.class);
            java.util.Map<java.lang.String, java.lang.Object> map = userObject.getDisliked();
            if (map == null)
                map = new java.util.HashMap<java.lang.String, java.lang.Object>();
            
            for (java.lang.String key : map.keySet()) {
                dislikedTitles.add(key);
            }
        }
    }
}