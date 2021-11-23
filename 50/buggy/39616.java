public static void nullSafeAppend(android.widget.TextView textView, java.util.Date date, java.text.DateFormat dateFormat) {
    if (date == null) {
        return ;
    }else {
        textView.append(dateFormat.format(date));
    }
}