public ch.helin.messages.dto.way.Waypoint convertToWaypointDto(models.WayPoint wayPoint) {
    ch.helin.messages.dto.way.Waypoint wayPointDto = new ch.helin.messages.dto.way.Waypoint();
    wayPointDto.setId(wayPoint.getId());
    ch.helin.messages.dto.way.Position position = commons.gis.GisHelper.createPosition(wayPoint.getPosition());
    position.setHeight(wayPoint.getHeight());
    wayPointDto.setPosition(position);
    wayPointDto.setId(wayPoint.getId());
    wayPointDto.setAction(wayPoint.getAction());
    return wayPointDto;
}