public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, uts.sep.tcba.sepprototype.Controller_MakeAvailability.class);
    android.os.Bundle b = new android.os.Bundle();
    b.putSerializable("user", currentTutor);
    intent.putExtras(b);
    startActivityForResult(intent, 1);
}