public org.i3xx.util.client.io.JsonResult toJsonResult() {
    return (result) == null ? new org.i3xx.util.client.io.JsonResultImpl(null, retCode.intValue()) : result.toJsonResult();
}