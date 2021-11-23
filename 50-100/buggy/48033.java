@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonShelters :
            intent = new android.content.Intent(this, com.example.group1.puppyfinder.ShelterLocationActivity.class);
            startActivity(intent);
            break;
        case R.id.buttonEvents :
            intent = new android.content.Intent(this, com.example.group1.puppyfinder.EventActivity.class);
            startActivity(intent);
            break;
        case R.id.buttonMap :
            intent = new android.content.Intent(this, com.example.group1.puppyfinder.SearchShelterActivity.class);
            break;
        case R.id.imageButton5 :
            break;
    }
}