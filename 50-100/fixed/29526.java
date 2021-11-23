@java.lang.Override
public void run() {
    clickHandled = true;
    handler.removeCallbacksAndMessages(null);
    if ((((link) != null) && ((link.length) > 0)) && ((link[0]) != null))
        this.clickableText.onLinkLongClick(link[0].getURL());
    
}