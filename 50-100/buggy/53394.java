@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    spInfo = getActivity().getSharedPreferences("loaded_info", Context.MODE_PRIVATE);
    spConfigure = getActivity().getSharedPreferences("configure", Context.MODE_PRIVATE);
    spData = getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
    if (spInfo.getBoolean("is_loaded", false)) {
        initTitleBar();
        initViewCompoent();
    }else {
        com.microbox.model.HttpGetJsonModelThread hgjmt = new com.microbox.model.HttpGetJsonModelThread(handlerContent, com.microbox.config.ApiUrlConfig.URL_CONFERENCE_CONTENT);
        hgjmt.start();
    }
}