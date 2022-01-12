public static org.sonatype.nexus.security.user.User toUser(org.apache.http.HttpResponse r) {
    if (org.sonatype.nexus.crowd.plugin.internal.entity.mapper.CrowdMapper.responseOK(r)) {
        try {
            return org.sonatype.nexus.crowd.plugin.internal.entity.mapper.CrowdMapper.toUser(org.sonatype.nexus.crowd.plugin.internal.entity.mapper.CrowdMapper.gson.fromJson(org.apache.http.util.EntityUtils.toString(r.getEntity()), org.sonatype.nexus.crowd.plugin.internal.entity.CrowdUserResult.class));
        } catch (com.google.gson.JsonSyntaxException | org.apache.http.ParseException | java.io.IOException e) {
            org.sonatype.nexus.crowd.plugin.internal.entity.mapper.CrowdMapper.LOGGER.error("Error while mapping result", e);
        }
    }else {
        org.sonatype.nexus.crowd.plugin.internal.entity.mapper.CrowdMapper.LOGGER.error("Error with request %s - %d", r.getEntity(), r.getStatusLine());
    }
    return null;
}