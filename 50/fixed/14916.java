@java.lang.Override
public void onClick(android.view.View v) {
    intent = new android.content.Intent(this, at.sw2017.q_up.InfoActivity.class);
    intent.putExtra("title", at.sw2017.q_up.PlaceDetails.title);
    intent.putExtra("id", at.sw2017.q_up.PlaceDetails.id);
    startActivity(intent);
}