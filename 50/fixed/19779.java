public static void _onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((com.inthecheesefactory.lib.fblike.widget.FBLikeView.callbackManager) != null)
        com.inthecheesefactory.lib.fblike.widget.FBLikeView.callbackManager.onActivityResult(requestCode, resultCode, data);
    
}