public static java.lang.String[] convertStatusToArray(twitter4j.Status status) {
    if (status == null) {
        return null;
    }
    java.lang.String dateFormat = new java.text.SimpleDateFormat("hh:mm", java.util.Locale.ENGLISH).format(status.getCreatedAt());
    return new java.lang.String[]{ dateFormat , status.getUser().getBiggerProfileImageURL() , status.getUser().getName() , status.getUser().getScreenName() , status.getText() , java.lang.String.valueOf(status.getId()) };
}