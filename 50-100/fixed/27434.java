public void Gen_populate(android.androidVNC.Cursor cursor, int[] columnIndices) {
    if (((columnIndices[android.androidVNC.MostRecentBean.GEN_ID__ID]) >= 0) && (!(cursor.isNull(columnIndices[android.androidVNC.MostRecentBean.GEN_ID__ID])))) {
        gen__Id = cursor.getLong(columnIndices[android.androidVNC.MostRecentBean.GEN_ID__ID]);
    }
    if (((columnIndices[android.androidVNC.MostRecentBean.GEN_ID_CONNECTION_ID]) >= 0) && (!(cursor.isNull(columnIndices[android.androidVNC.MostRecentBean.GEN_ID_CONNECTION_ID])))) {
        gen_CONNECTION_ID = cursor.getLong(columnIndices[android.androidVNC.MostRecentBean.GEN_ID_CONNECTION_ID]);
    }
}