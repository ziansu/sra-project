@java.lang.Override
public void onClick(android.view.View v) {
    mNotRegisteredText.setTextColor(getResources().getColor(R.color.colorAccent));
    android.content.Intent registerIntent = new android.content.Intent(this, koala.com.koalaapp.RegisterActivity.class);
    startActivity(registerIntent);
}