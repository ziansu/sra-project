@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap result) {
    if ((result != null) && ((imv) != null)) {
        java.lang.System.out.println(stringpath);
        imv.setImageBitmap(result);
    }else
        if (((imv) != null) && (!(isFile))) {
            com.pixplicity.sharp.Sharp.loadResource(context.getResources(), path).into(imv);
        }
    
}