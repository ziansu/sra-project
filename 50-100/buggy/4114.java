private java.lang.CharSequence getClasscastContent() {
    java.lang.String content = "";
    if ((text) != null)
        content += text;
    
    content += (("<br><b>When:</b> " + (getProcessedStartTime())) + " to ") + (getProcessedEndTime());
    content += "<br><b>Duration:</b> " + (getTimeStringFromMinutes(length));
    content += "<br><b>Status:</b> " + (getClassCastStatus());
    java.lang.CharSequence formattedContent = formatContent(content);
    return android.text.TextUtils.concat(formattedContent, "\n\n", "Please use a desktop computer to access this ClassCast.");
}