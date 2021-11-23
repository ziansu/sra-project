@java.lang.Override
public void onSuccess(java.lang.String s) {
    android.graphics.Bitmap bitmap = com.example.hitao.activity.RecyclerViewAdapter.decodeSampledBitmapfromFielPath(file.getPath(), width, height);
    if (((file.getPath()) != null) || (bitmap != null)) {
        addBitmapToMemoryCache(file.getPath(), bitmap);
    }
    if (bitmap != null) {
        holder.productPic.setImageBitmap(bitmap);
    }else {
        holder.productPic.setImageResource(R.drawable.welcome);
    }
}