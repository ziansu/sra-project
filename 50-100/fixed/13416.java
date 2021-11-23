public static void sendNoticeRequest(final android.content.Context context, final java.lang.String studentId, final int networkLectureId, final com.android.volley.Response.Listener listener) {
    org.zeropage.causcheduler.Network.PortalNetworkQueue.sendNoticeRequest(context, studentId, networkLectureId, listener, new com.android.volley.Response.ErrorListener() {
        @java.lang.Override
        public void onErrorResponse(com.android.volley.VolleyError error) {
            android.util.Log.e(org.zeropage.causcheduler.Network.PortalNetworkQueue.LOG_TAG, ("\ub124\ud2b8\uc6cc\ud06c \uc804\uc1a1 \uc791\uc5c5\uc5d0 \uc2e4\ud328\ud588\uc2b5\ub2c8\ub2e4. \ub2e4\uc74c \ub0b4\uc6a9\uc744 \ucc38\uace0\ud558\uc138\uc694.\n" + (error.getMessage())));
            android.widget.Toast.makeText(context, "정보 수신에 실패했습니다.", Toast.LENGTH_LONG).show();
        }
    });
}