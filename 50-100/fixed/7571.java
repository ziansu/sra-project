@java.lang.Override
protected com.rezoleo.zer0data.object.AllInformation doInBackground(java.lang.String... params) {
    java.lang.String mode = params[0];
    java.lang.String attribute = params[1];
    allInformation = new com.rezoleo.zer0data.object.AllInformation();
    apiException = null;
    switch (mode) {
        case "login" :
            break;
        case "card" :
            try {
                allInformation.setCard(httpClient.getOneCardByCode(attribute));
            } catch (fr.applicationcore.object.APIException e) {
                e.printStackTrace();
                apiException = e;
            }
            break;
        default :
            break;
    }
    return allInformation;
}