@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (callback != null) {
        java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>();
        result.put(com.taobao.weex.ui.module.WXModalUIModule.RESULT, okTitle_f);
        result.put(com.taobao.weex.ui.module.WXModalUIModule.DATA, editText.getText().toString());
        callback.invoke(result);
    }
}