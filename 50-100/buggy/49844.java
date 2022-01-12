public boolean deleteCurrentBeacon() {
    com.mongodb.client.result.DeleteResult dr = beacons.deleteOne(and(java.util.Arrays.asList(com.mongodb.client.model.Filters.eq("creator", this.creator), com.mongodb.client.model.Filters.gt("endTime", new java.util.Date()))));
    return (gr.getDeletedCount()) > 0;
}