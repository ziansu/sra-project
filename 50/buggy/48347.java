public static Commands.SrlUpdateList createSimpleDatabaseListWithSaveMarker(long submissionTime) {
    protobuf.srl.commands.Commands.SrlUpdateList fakeList = util.SubmissionMergerTest.createSimpleDatabaseList(100);
    return database.SubmissionDatabaseClientTest.addSaveMarker(fakeList, submissionTime);
}