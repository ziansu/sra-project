@java.lang.Override
public void onSave(java.io.PrintWriter writer) {
    for (java.lang.Integer id : mIDs.keySet()) {
        if (id <= (mLatestSavedURLID))
            continue;
        
        java.lang.String url = mURLCash.get(id);
        if (url != null) {
            writer.println(url);
        }
    }
}