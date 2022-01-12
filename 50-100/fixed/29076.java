@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    if ((result != null) && ((imv) != null)) {
        imv.setImageBitmap(result);
    }else
        if (((imv) != null) && (!(isFile))) {
            com.pixplicity.sharp.Sharp.loadResource(context.getResources(), path).into(imv);
        }
    
}