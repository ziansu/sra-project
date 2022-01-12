@rest.POST
@rest.Consumes(value = "application/json")
@io.swagger.annotations.ApiOperation(value = "erstellt einen Club; mit RepresentativeId und LocationId")
public javax.ws.rs.core.Response create(entity.Club club) {
    entity.Representative representative = club.getRepresentative();
    entity.Location location = club.getLocation();
    club.setRepresentative(representative);
    club.setLocation(location);
    em.persist(club);
    return javax.ws.rs.core.Response.created(javax.ws.rs.core.UriBuilder.fromResource(rest.ClubResource.class).path(java.lang.String.valueOf(club.getId())).build()).build();
}