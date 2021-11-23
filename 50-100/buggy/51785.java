public void index(models.TripleCommit.Diff diff) {
    java.util.Set<models.Resource> denormalizedResources = getResources(diff);
    for (models.Resource dnr : denormalizedResources) {
        if (dnr.hasId()) {
            java.lang.String type = dnr.getAsString(JsonLdConstants.TYPE);
            try {
                mTargetRepo.addResource(new models.Record(dnr), new services.HashMap());
            } catch (java.io.IOException e) {
                play.Logger.error("Could not index commit", e);
            }
        }
    }
}