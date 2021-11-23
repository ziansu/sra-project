protected void onPostExecute(android.graphics.Bitmap result) {
    if ((activity) != null) {
        activity.upDateList();
    }else
        if ((viewHolder) != null) {
            viewHolder.imageView.setImageBitmap(result);
        }
    
    if ((imgData) != null) {
        imgData.setBitmap(result);
        activity.upDateList();
    }
}