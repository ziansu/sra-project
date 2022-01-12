public static void setImage(final com.facebook.drawee.view.SimpleDraweeView view, final java.lang.String url) {
    view.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (url == null) {
                view.setImageURI(Uri.EMPTY);
            }else {
                if ((url.length()) == 0)
                    view.setImageURI(Uri.EMPTY);
                else
                    view.setImageURI(android.net.Uri.parse(url));
                
            }
        }
    });
}