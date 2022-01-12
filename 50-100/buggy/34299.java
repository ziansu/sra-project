public java.lang.String EnterData(java.util.Hashtable<java.lang.String, java.lang.String> getvalue, java.lang.String objname) {
    try {
        com.utils.Keywords.log("EnterPassword function");
        java.lang.String[] tmp = objname.split(",");
        java.lang.String result = sendData(tmp[0], tmp[1]);
        return result;
    } catch (java.lang.Exception ex) {
        com.utils.Keywords.log(("reason :" + (ex.getMessage())));
        return "Fail";
    }
}