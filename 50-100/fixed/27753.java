@android.databinding.BindingAdapter(value = "bind:elapsedTime")
public static void setElapsedTime(android.widget.TextView pView, java.lang.Long elapsedTime) {
    com.taf.data.utils.Logger.e("BindingUtil", ("createdAt: " + elapsedTime));
    if (elapsedTime != null) {
        pView.setText(com.taf.shuvayatra.util.BindingUtil.getTimeAgo(elapsedTime, pView.getContext()));
    }
}