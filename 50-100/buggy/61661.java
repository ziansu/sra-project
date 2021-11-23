@java.lang.Override
public void onSuccess(java.lang.String s) {
    android.graphics.Bitmap bitmap = com.example.hitao.activity.RecyclerViewAdapter.decodeSampledBitmapfromFielPath(file.getPath(), width, height);
    addBitmapToMemoryCache(file.getPath(), bitmap);
    if (bitmap != null) {
        holder.productPic.setImageBitmap(bitmap);
    }else {
        holder.productPic.setImageResource(R.drawable.welcome);
    }
}