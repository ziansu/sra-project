public static java.lang.String[] convertStatusToArray(twitter4j.Status status) {
    if (status == null) {
        return null;
    }
    return new java.lang.String[]{ java.lang.String.valueOf(status.getCreatedAt().getTime()) , status.getUser().getBiggerProfileImageURL() , status.getUser().getName() , status.getUser().getScreenName() , status.getText() , java.lang.String.valueOf(status.getId()) };
}