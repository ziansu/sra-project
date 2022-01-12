public java.util.List<com.example.agathe.tsgtest.dto.Contact> getPrivateContacts(int numberOfContacts) {
    java.util.List<com.example.agathe.tsgtest.dto.Contact> contacts = null;
    com.olab.smplibrary.SMPLibrary.GetPrivateContacts(context, numberOfContacts, new com.olab.smplibrary.DataResponseCallback() {
        @java.lang.Override
        public void OnResponse(int response_code, java.lang.String data_response) {
            android.util.Log.i("MainActivity:Response", ("GetPrivateContacts response code " + response_code));
            android.util.Log.i("MainActivity:Response", ("GetPrivateContacts - " + data_response));
        }
    });
    return contacts;
}