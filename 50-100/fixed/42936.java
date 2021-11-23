@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int token, android.os.Bundle bundle) {
    android.net.Uri uri = null;
    switch (token) {
        case com.example.interview.mainpage.MainActivity.TOKEN_VIEW :
            uri = com.example.interview.storage.Contract.contentUri(Contract.VideoView.class);
            break;
    }
    return new android.content.CursorLoader(this, uri, null, null, null, null);
}