@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    switch (id) {
        case com.mattkormann.tournamentmanager.HistoryFragment.PARTICIPANT_LOADER :
            return new android.support.v4.content.CursorLoader(getActivity(), DatabaseContract.ParticipantTable.CONTENT_URI, null, ((DatabaseContract.ParticipantTable.COLUMN_NAME_IS_TEAM) + "=?"), new java.lang.String[]{ "0" }, ((DatabaseContract.ParticipantTable._ID) + " ASC"));
        case com.mattkormann.tournamentmanager.HistoryFragment.TOURNAMENT_LOADER :
            return new android.support.v4.content.CursorLoader(getActivity(), DatabaseContract.TournamentHistory.CONTENT_HISTORY_URI, null, null, null, ((DatabaseContract.TournamentHistory.COLUMN_NAME_SAVE_TIME) + " DESC"));
        default :
            return null;
    }
}