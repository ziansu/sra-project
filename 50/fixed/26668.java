@java.lang.Override
public void setMessage(int message, boolean error) {
    int color = (error) ? android.graphics.Color.RED : android.graphics.Color.GREEN;
    firstedia.com.newsmanagement.utils.SnackBarMessage.message(snackbar, linearLayout, message, color);
}