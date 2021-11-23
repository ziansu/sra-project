@java.lang.Override
public cn.edu.jxnu.awesome_campus.support.utils.net.request.IRequest addParams(java.lang.String key, java.lang.String val) {
    if (cn.edu.jxnu.awesome_campus.support.utils.common.TextUtil.isNull(url)) {
        throw new java.lang.IllegalArgumentException("NETWORK : url can't be null !!!!");
    }
    if (isFirstParams) {
        url += "?";
        isFirstParams = false;
    }else {
        url += "&";
    }
    url = (((url) + key) + "=") + val;
    return this;
}