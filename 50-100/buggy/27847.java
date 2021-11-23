public void onClick(android.view.View arg0) {
    if (((nameText.getText().toString().length()) > 0) || ((passText.getText().toString().length()) > 0)) {
    }else {
        android.app.FragmentManager fm = getFragmentManager();
        com.example.annaroxas.teamdiscovery.SingleResponseDialog alertdFragment = com.example.annaroxas.teamdiscovery.SingleResponseDialog.newInstance(com.example.annaroxas.teamdiscovery.LoginPage.title, com.example.annaroxas.teamdiscovery.LoginPage.message, com.example.annaroxas.teamdiscovery.LoginPage.button_label);
        alertdFragment.show(fm, "Fields Empty Error");
    }
}