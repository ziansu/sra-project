@java.lang.Override
protected void onPostExecute(java.lang.Integer z) {
    android.util.Log.d("This", this.mContext.getClass().toString());
    com.example.etaspare.stitchcounter.LibraryActivity context = ((com.example.etaspare.stitchcounter.LibraryActivity) (this.mContext));
    context.updateCursor();
}