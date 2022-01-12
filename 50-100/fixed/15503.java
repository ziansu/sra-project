@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    com.parse.ParseObject usrObj = obj.getParseObject("user_obj");
    usrObj.fetchIfNeeded();
    com.parse.ParseFile pf = usrObj.getParseFile("user_photo");
    if ((pf != null) && ((edu.gvsu.cis.dulimarh.checkout.ImageStore.get(pf.getUrl())) == null)) {
        android.graphics.drawable.Drawable d = android.graphics.drawable.Drawable.createFromStream(new java.io.ByteArrayInputStream(pf.getData()), "");
        edu.gvsu.cis.dulimarh.checkout.ImageStore.put(usrObj.getObjectId(), d);
    }
    return null;
}