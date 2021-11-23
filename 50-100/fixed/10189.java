@org.junit.Test
public void toEntity() throws java.lang.Exception {
    com.duoec.commons.pojo.house.House house = houseDao.find(com.mongodb.client.model.Filters.eq("_id", 14607)).first();
    org.bson.Document doc = com.duoec.commons.mongo.MongoConverter.toDocument(house);
    com.duoec.commons.pojo.house.House house2 = com.duoec.commons.mongo.MongoConverter.toEntity(doc, com.duoec.commons.pojo.house.House.class);
    assertEquals(house, house2);
}