@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.Class destinationClass = com.example.alvinlam.drawer.activity.AddCardAddActivity.class;
    android.content.Intent intentToStartAddCardActivity = new android.content.Intent(this, destinationClass);
    startActivity(intentToStartAddCardActivity);
}