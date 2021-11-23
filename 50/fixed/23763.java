@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GlobalVariables.CUSTOMER_PHONE_NUM = com.example.FundigoApp.StaticMethod.FileAndImageMethods.getCustomerPhoneNumFromFile(this);
    customerLogin();
    createCustomerMainPage();
    com.example.FundigoApp.MainActivity.EXIT = false;
}