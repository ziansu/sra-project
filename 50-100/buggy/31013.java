@java.lang.Override
public void onSuccess(cn.edu.jxnu.awesome_campus.model.life.CampusATMBean entity, com.squareup.okhttp.Headers headers) {
    final java.util.List<cn.edu.jxnu.awesome_campus.model.life.CampusATMModel> list = entity.getCampusATM();
    cacheAll(list);
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            org.greenrobot.eventbus.EventBus.getDefault().post(new cn.edu.jxnu.awesome_campus.event.EventModel<cn.edu.jxnu.awesome_campus.model.life.CampusATMModel>(cn.edu.jxnu.awesome_campus.event.EVENT.CAMPUS_ATM_REFRESH_SUCCESS, list));
        }
    });
}