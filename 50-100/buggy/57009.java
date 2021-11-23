@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    if ((null != (viewReference)) && (null != result)) {
        final dev.dworks.apps.anexplorer.ExplorerFragment.ViewHolder holder = viewReference.get();
        if (((null != holder) && (null != (holder.fileIcon))) && ((holder.position) == (position))) {
            holder.fileIcon.setImageBitmap(result);
        }
    }
    super.onPostExecute(result);
}