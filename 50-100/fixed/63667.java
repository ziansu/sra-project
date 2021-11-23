@java.lang.Override
public java.lang.String errorMessage() {
    java.lang.StringBuilder msg = new java.lang.StringBuilder();
    if ((userId) == 0)
        msg.append(Constants.INVALID_USER_ID);
    
    if ((contentId) == 0)
        msg.append(Constants.INVALID_CONTENT_ID);
    
    if (((doLike) == null) || (doLike.trim().isEmpty()))
        java.lang.System.out.println((((userId) + (contentId)) + (doLike)));
    
    msg.append(Constants.INVALID_DO_LIKE);
    return msg.toString();
}