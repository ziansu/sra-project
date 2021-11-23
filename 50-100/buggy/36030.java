public com.yoouyi.model.user.FavoritePO save(com.yoouyi.model.user.FavoritePO favoritePO) {
    mongoTemplate.upsert(org.springframework.data.mongodb.core.query.Query.query(org.springframework.data.mongodb.core.query.Criteria.where("userId").is(favoritePO.getUserId()).and("trip").is(favoritePO.getTrip())), org.springframework.data.mongodb.core.query.Update.update("createDate", favoritePO.getCreateDate()), com.yoouyi.model.user.FavoritePO.class);
    return favoritePO;
}