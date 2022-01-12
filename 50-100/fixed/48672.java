public java.util.ArrayList<resources.InputParameter> convertStringToInputParameter(java.lang.String[] source) {
    java.util.ArrayList<resources.InputParameter> array = new java.util.ArrayList<resources.InputParameter>();
    if (source != null) {
        for (java.lang.String s : source) {
            java.lang.System.out.println(s);
            resources.JSONObject obj = new resources.JSONObject(s);
            java.lang.String parameter = obj.getString("parameter");
            java.lang.String type = obj.getString("type");
            resources.InputParameter ip = new resources.InputParameter(parameter, type);
            array.add(ip);
        }
    }
    return array;
}