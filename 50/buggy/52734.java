@android.webkit.JavascriptInterface
public void savePartialFormData(java.lang.String partialData) {
    android.widget.Toast.makeText(mContext, "saving un-submitted form data", Toast.LENGTH_LONG).show();
    ((org.ei.opensrp.view.activity.SecuredNativeSmartRegisterActivity) (getActivity())).savePartialFormData(partialData, recordId, formName, getFormFieldsOverrides());
}