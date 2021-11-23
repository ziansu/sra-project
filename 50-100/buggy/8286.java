@java.lang.Override
public void onSuccessResponse(redit.com.redditshow.network.reply.Listing response) {
    if (redit.com.redditshow.util.Constant.DEBUG)
        android.util.Log.d(redit.com.redditshow.view.MainActivity.TAG, response.toString());
    
    try {
        android.widget.Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        handleResponse(response);
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }
}