public model.Routelike getLikeByUser(model.RoutelikeId routelikeid) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<model.Routelike> routelikes = ((java.util.List<model.Routelike>) (getHibernateTemplate().find("from Routelike as r where r.id.routeid=? and r.id.userid=? ", routelikeid.getRouteid(), routelikeid.getUserid())));
    model.Routelike liked = ((routelikes.size()) > 0) ? routelikes.get(0) : new model.Routelike(new model.RoutelikeId(0, 0), 0);
    return liked;
}