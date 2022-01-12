@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    android.net.Uri innerJoinUri = com.tjeannin.provigen.helper.ProviGenUriBuilder.joinUri(ProviGenUriBuilder.JoinType.INNER_JOIN, SampleContract.Person.CONTENT_URI, new com.tjeannin.provigen.model.JoinEntity(SampleContract.Specialty.CONTENT_URI, SampleContract.Person.SPECIALTY_ID, SampleContract.Specialty.ID));
    return new android.support.v4.content.CursorLoader(this, innerJoinUri, SampleContract.Person.JOIN_PROJECTION, null, null, SampleContract.Person.DEFAULT_SORT_ORDER);
}