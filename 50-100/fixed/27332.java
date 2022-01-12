@java.lang.Override
public boolean apply(com.rsdt.jotial.communication.ApiResult result) {
    return ((result.getRequest().getUrl().getPath().split("/")[1].equals("sc")) && ((result.getResponseCode()) == 200)) && (result.getRequest().getMethod().equals(ApiRequest.GET));
}