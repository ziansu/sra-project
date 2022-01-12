public static models.Ballot findById(java.lang.Object id) {
    return models.Ballot.ballots().findOne("{_id: #}", id).as(models.Ballot.class);
}