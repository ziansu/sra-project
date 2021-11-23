private void onClickStandard() {
    android.content.Intent callIntent = sinolight.cn.qgapp.views.activity.DBResourceActivity.getCallIntent(sinolight.cn.qgapp.App.getContext());
    callIntent.putExtra(AppContants.DataBase.KEY_TYPE, AppContants.DataBase.Type.DB_STANDARD.getType());
    callIntent.putExtra(AppContants.DataBase.KEY_RES_TYPE, AppContants.DataBase.Res.RES_STANDARD);
    callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    sinolight.cn.qgapp.App.getContext().startActivity(callIntent);
}