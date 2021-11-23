@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    super.onErrorResponse(volleyError);
    txt_no_learning.setVisibility(View.VISIBLE);
}