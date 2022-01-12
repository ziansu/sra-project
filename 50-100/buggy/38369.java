public void onActivityCreated(com.tns.Activity param_0, com.tns.Bundle param_1) {
    if (ErrorReport.HasApplicationCreateError) {
        return ;
    }
    java.lang.Object[] params = new java.lang.Object[2];
    params[0] = param_0;
    params[1] = param_1;
    com.tns.com.tns.Platform.callJSMethod(this, "onActivityCreated", void.class, params);
}