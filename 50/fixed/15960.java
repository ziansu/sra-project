public static void avatarChange(android.content.Context context, java.lang.String avatar) {
    java.lang.String json = null;
    cn.edu.xjtu.se.util.XGAPI.xgHttp.post(cn.edu.xjtu.se.util.XGAPI.AVATAR_CHANGE_URL, json, new cn.edu.xjtu.se.util.XGHttp.MOkCallBack() {
        @java.lang.Override
        public void onSuccess(java.lang.String str) {
        }

        @java.lang.Override
        public void onError() {
        }
    });
}