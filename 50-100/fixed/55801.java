private java.lang.String prettyUploadedDate(fr.free.nrw.commons.Media media) {
    java.util.Date date = media.getDateUploaded();
    if (((date == null) || ((date.toString()) == null)) || (date.toString().isEmpty())) {
        return "Uploaded date not available";
    }
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd MMM yyyy");
    return formatter.format(date);
}