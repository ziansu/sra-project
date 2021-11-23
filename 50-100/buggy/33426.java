private boolean handleTilePublish(fi.otavanopisto.kuntaapi.server.id.OrganizationId organizationId, fi.otavanopisto.kuntaapi.server.integrations.management.webhooks.Payload payload) {
    fi.otavanopisto.kuntaapi.server.id.TileId tileId = new fi.otavanopisto.kuntaapi.server.id.TileId(organizationId, fi.otavanopisto.kuntaapi.server.integrations.management.ManagementConsts.IDENTIFIER_NAME, payload.getId());
    java.lang.Long orderIndex = getTileOrderIndex(tileId);
    if (orderIndex != null) {
        taskRequest.fire(new fi.otavanopisto.kuntaapi.server.tasks.TaskRequest(true, new fi.otavanopisto.kuntaapi.server.tasks.IdTask<fi.otavanopisto.kuntaapi.server.id.TileId>(fi.otavanopisto.kuntaapi.server.tasks.IdTask.Operation.UPDATE, tileId, orderIndex)));
    }else {
        logger.warning(java.lang.String.format("Failed to resolve order index for tile %s", tileId));
    }
    return true;
}