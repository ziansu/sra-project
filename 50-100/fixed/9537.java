@java.lang.Override
public void onResponse(java.lang.String response) {
    super.onResponse(response);
    if (android.text.TextUtils.isEmpty(response))
        return ;
    
    com.bai.chesscard.bean.BaseBean baseBean = new com.google.gson.Gson().fromJson(response, com.bai.chesscard.bean.BaseBean.class);
    if ((baseBean.id) == 1) {
        gamePresenterNew.resetUserInfo(ConstentNew.USERPOS);
        resetUserStatue();
    }else
        com.bai.chesscard.utils.Tools.toastMsgCenter(context, baseBean.msg);
    
}