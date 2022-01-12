@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent LocationView;
    LocationView = new android.content.Intent(this, com.hackathon.thesingularityproject.helpmycity.AddProblemLocation.class);
    startActivity(LocationView);
}