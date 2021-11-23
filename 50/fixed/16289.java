public java.lang.String getPrometheusUrl() {
    java.lang.String paramSails = "/host/getPrometheusUrl";
    java.lang.String str = callSailsGET(paramSails);
    str = str.substring(21, ((str.length()) - 8));
    return str;
}