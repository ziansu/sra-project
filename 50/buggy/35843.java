public prog.core.Share getShare(java.lang.String shareName) {
    for (prog.core.Share share : shares) {
        if ((share.getName()) == shareName)
            return share;
        
    }
    throw new prog.exception.ObjectNotFoundException((("Share " + shareName) + " doesn't exist"));
}