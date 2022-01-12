@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentFragmentPosition) == 0) {
        clicked();
    }else
        if ((currentFragmentPosition) == 2) {
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), mc2.tvz.croatiago.activities.AddPlaceActivity.class);
            startActivity(intent);
        }
    
}