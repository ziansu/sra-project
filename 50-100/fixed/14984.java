@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public java.util.List<ecommerce_api.entities.Announcement> getAnnouncementsByUser() throws java.lang.IllegalAccessException {
    java.lang.System.out.println(req.getSession().getAttribute("uid"));
    if ((req.getSession().getAttribute("uid")) == null)
        throw new java.lang.IllegalAccessException("User not authenticated");
    
    return announcementRepository.findAnnouncementsByUserId(((java.lang.Long) (req.getSession().getAttribute("uid"))));
}