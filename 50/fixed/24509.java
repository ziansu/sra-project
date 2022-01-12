public void onPageFinished(android.webkit.WebView view, java.lang.String address) {
    view.loadUrl("javascript:console.log('MAGIC'+'<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
}