private java.lang.String buildMessage(java.lang.String location) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(R.string.message_prefix);
    sb.append(mAuthor.getText());
    sb.append(".");
    sb.append(getString(R.string.location_message_prefix));
    sb.append(" ");
    sb.append(location);
    return sb.toString();
}