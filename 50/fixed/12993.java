public java.lang.String getToolIdFromEventId(java.lang.String eventId) {
    if (null != (M_ers.getEventIdToolMap().get(eventId)))
        return M_ers.getEventIdToolMap().get(eventId).getToolId();
    else
        return null;
    
}