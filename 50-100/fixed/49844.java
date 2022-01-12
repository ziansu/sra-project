public boolean deleteCurrentBeacon() {
    com.mongodb.client.result.DeleteResult dr = beacons.deleteOne(com.mongodb.client.model.Filters.and(java.util.Arrays.asList(com.mongodb.client.model.Filters.eq("creator", this.creator), com.mongodb.client.model.Filters.gt("endTime", new java.util.Date()))));
    return (dr.getDeletedCount()) > 0;
}