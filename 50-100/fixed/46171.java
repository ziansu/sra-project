public void showParkRatings(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, de.uulm.dbis.coaster2go.activities.RatingActivity.class);
    intent.putExtra("reviewedId", parkId);
    intent.putExtra("reviewedName", park.getName());
    if ((user) != null) {
        intent.putExtra("isParkAdmin", ((park.getAdmin().equals(user.getUid())) || (park.getAdmin().equals(""))));
    }
    startActivity(intent);
}