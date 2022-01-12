@android.databinding.BindingAdapter(value = { "setStrikeThrough" })
public static void setStrikeThrough(android.widget.TextView textView, java.lang.String discount) {
    if ((discount.equalsIgnoreCase("")) || (discount.equalsIgnoreCase("0"))) {
        textView.setPaintFlags(((textView.getPaintFlags()) | (android.graphics.Paint.STRIKE_THRU_TEXT_FLAG)));
    }else {
        textView.setPaintFlags(0);
    }
}