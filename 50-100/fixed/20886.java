public void initialise(org.apache.cordova.CordovaInterface crd, org.apache.cordova.CordovaWebView wbview) {
    if ((gr.navarino.cordova.plugin.PjsipActions.pjsipActivity) == null) {
        gr.navarino.cordova.plugin.PjsipActions.cordova = crd;
        gr.navarino.cordova.plugin.PjsipActions.webView = wbview;
        gr.navarino.cordova.plugin.PjsipActions.pjsipActivity = new gr.navarino.cordova.plugin.PjsipActivity();
        gr.navarino.cordova.plugin.PjsipActions.pjsipActivity.initialise(gr.navarino.cordova.plugin.PjsipActions.cordova.getActivity().getFilesDir().getAbsolutePath());
        mContext = gr.navarino.cordova.plugin.PjsipActions.cordova.getActivity();
        scAudio.initialise(gr.navarino.cordova.plugin.PjsipActions.cordova, gr.navarino.cordova.plugin.PjsipActions.webView);
    }
}