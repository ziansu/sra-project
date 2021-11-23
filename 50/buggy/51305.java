public static models.Ballot findById(org.bson.types.ObjectId id) {
    return models.Ballot.ballots().findOne("{_id: #}", id).as(models.Ballot.class);
}