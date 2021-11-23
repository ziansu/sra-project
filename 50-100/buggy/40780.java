@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    br.edu.ifspsaocarlos.sdm.trabalhofinalchat.model.Contact userInfo = new br.edu.ifspsaocarlos.sdm.trabalhofinalchat.model.Contact();
    userInfo.setId(660);
    userInfo.setName("Robson Teixeira");
    userInfo.setNickname("robson.teixeira");
    userInfoDao.save(userInfo);
    if (this.userExists()) {
        this.createViewContactsFragment();
    }else {
        this.createAddContactFragment();
    }
    serviceIntent = new android.content.Intent(getApplicationContext(), br.edu.ifspsaocarlos.sdm.trabalhofinalchat.services.SearchNewMessagesService.class);
    startService(serviceIntent);
}