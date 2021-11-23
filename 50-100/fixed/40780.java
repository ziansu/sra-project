@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (this.userExists()) {
        this.createViewContactsFragment();
    }else {
        this.createAddContactFragment();
    }
    serviceIntent = new android.content.Intent(getApplicationContext(), br.edu.ifspsaocarlos.sdm.trabalhofinalchat.services.SearchNewMessagesService.class);
    startService(serviceIntent);
}