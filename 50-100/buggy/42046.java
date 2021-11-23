protected void onProgressUpdate(java.lang.Integer... progress) {
    if ((localUri) != null)
        com.superchat.ui.ChatListAdapter.processing.put(localUri, ("" + (java.lang.Integer.parseInt(("" + ((int) (((progress[0]) * 100) / (progress[1]))))))));
    
    super.onProgressUpdate(progress);
}