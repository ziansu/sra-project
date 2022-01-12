public void buttonClicked(android.view.View view) {
    switch (java.lang.Integer.parseInt(view.getTag().toString())) {
        case 0 :
            android.content.Intent i = new android.content.Intent(getApplicationContext(), com.rebensburgsolutions.sayit.LoginActivity.class);
            startActivity(i);
            break;
        case 1 :
            android.content.Intent j = new android.content.Intent(getApplicationContext(), com.rebensburgsolutions.sayit.RegisterActivity.class);
            startActivity(j);
            break;
        default :
            android.widget.Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_LONG).show();
            break;
    }
}