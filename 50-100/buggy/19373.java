@java.lang.Override
public void onClick(android.view.View v) {
    if (v == (this.lblClipboard))
        net.alegen.android.netclip.util.Clipboard.getInstance(this.getContext()).setClipboardTextAndClean(this.text);
    else
        if (v == (this.lblDelete))
            net.alegen.android.netclip.netio.CommunicationsManager.getInstance().deleteText(this.index);
        
    
    this.dismiss();
}