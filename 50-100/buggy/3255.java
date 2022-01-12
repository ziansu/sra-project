protected java.lang.String doInBackground(java.lang.Void... params) {
    ethanfortin_nicaragua.elbluffhospital.RequestHandler reqHan = new ethanfortin_nicaragua.elbluffhospital.RequestHandler();
    java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    java.lang.String s;
    switch (argChoice) {
        case 1 :
            map.put("patid", argVal);
            s = reqHan.sendGetRequestParam(ConnVars.URL_FETCH_PAT_RX, map);
            break;
        default :
            java.lang.System.out.println(("Default -- search did not work: argChoice == " + argChoice));
            s = "badMethod";
            break;
    }
    return s;
}