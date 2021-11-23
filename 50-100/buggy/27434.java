public void Gen_populate(android.androidVNC.Cursor cursor, int[] columnIndices) {
    if (!(cursor.isNull(0))) {
        gen__Id = cursor.getLong(columnIndices[android.androidVNC.MostRecentBean.GEN_ID__ID]);
    }
    if (!(cursor.isNull(1))) {
        gen_CONNECTION_ID = cursor.getLong(columnIndices[android.androidVNC.MostRecentBean.GEN_ID_CONNECTION_ID]);
    }
}