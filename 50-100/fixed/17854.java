@java.lang.Override
public void onClipboardText(com.termux.terminal.TerminalSession session, java.lang.String text) {
    if (!(mIsVisible))
        return ;
    
    android.content.ClipboardManager clipboard = ((android.content.ClipboardManager) (getSystemService(Context.CLIPBOARD_SERVICE)));
    clipboard.setPrimaryClip(new android.content.ClipData(null, new java.lang.String[]{ "text/plain" }, new android.content.ClipData.Item(text)));
}