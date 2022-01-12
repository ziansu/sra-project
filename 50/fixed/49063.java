@java.lang.Override
public void onFailure(java.lang.String error) {
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            org.greenrobot.eventbus.EventBus.getDefault().post(new cn.edu.jxnu.awesome_campus.event.EventModel<cn.edu.jxnu.awesome_campus.model.jxnugo.CommentModel>(cn.edu.jxnu.awesome_campus.event.EVENT.GOODS_COMMENT_REFRESH_FAILURE));
        }
    });
}