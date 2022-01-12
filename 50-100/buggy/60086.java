public void updateRelease(@lombok.NonNull
java.lang.String releaseName, @lombok.NonNull
org.icgc.dcc.submission.release.model.Release updatedRelease) {
    lombok.val result = updateFirst(createQuery().filter("name", releaseName), updatedRelease, false);
    result.getUpdatedCount();
    com.google.common.base.Preconditions.checkState((!(result.getHadError())), "Error updating release '%s': %s", releaseName, result.getError());
    com.google.common.base.Preconditions.checkState(((result.getUpdatedCount()) == 1), "Updating release '%s' failed: %s", releaseName, result.getWriteResult());
}