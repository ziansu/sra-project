public static void setApplication(android.app.Application application) {
    if ((application != null) && (application != (net.qiujuer.tips.factory.model.Model.APPLICATION))) {
        net.qiujuer.tips.factory.model.Model.log(net.qiujuer.tips.factory.model.Model.TAG, "setApplication");
        net.qiujuer.tips.factory.model.Model.APPLICATION = application;
        com.raizlabs.android.dbflow.config.FlowManager.init(new com.raizlabs.android.dbflow.config.FlowConfig.Builder(application).openDatabasesOnInit(true).build());
        net.qiujuer.tips.factory.model.Model.stopRequestQueue();
        net.qiujuer.tips.factory.model.Model.REQUEST_QUEUE = com.android.volley.toolbox.Volley.newRequestQueue(net.qiujuer.tips.factory.model.Model.APPLICATION);
    }
}