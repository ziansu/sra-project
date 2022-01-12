protected java.util.ArrayList<java.util.ArrayList<java.lang.String>> transfferQueryToServer(java.lang.String strQuery) {
    packaged.put("strQuery", strQuery);
    application.QueryController.chat.handleMessageFromClientUI(((java.lang.Object) (packaged)));
    while ((isAnswered) == false) {
        java.lang.System.out.print("");
    } 
    isAnswered = false;
    java.util.ArrayList<java.util.ArrayList<java.lang.String>> resultArray = ((java.util.ArrayList<java.util.ArrayList<java.lang.String>>) (packaged.get("ResultArray")));
    packaged.remove("ResultArray");
    return resultArray;
}