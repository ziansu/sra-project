@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentFragmentPosition) == 0) {
        clicked();
    }else
        if ((currentFragmentPosition) == 1) {
            android.widget.Toast.makeText(this, "Explore fab", Toast.LENGTH_SHORT).show();
        }else
            if ((currentFragmentPosition) == 2) {
                android.content.Intent intent = new android.content.Intent(getApplicationContext(), mc2.tvz.croatiago.activities.AddPlaceActivity.class);
                startActivity(intent);
            }
        
    
}