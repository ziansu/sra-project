@java.lang.Override
public android.view.View getHeader(android.app.Activity activity) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(activity);
    android.view.View header = inflater.inflate(R.layout.view_transfers_header, null, false);
    com.frostwire.android.gui.fragments.TextView text = findView(header, R.id.view_transfers_header_text_title);
    text.setText(R.string.transfers);
    buttonMenu = findView(header, R.id.view_transfers_header_button_menu);
    buttonMenu.setOnClickListener(buttonMenuListener);
    updateButtonMenuVisibility();
    com.frostwire.android.gui.fragments.ImageButton buttonAddTransfer = findView(header, R.id.view_transfers_header_button_add_transfer);
    buttonAddTransfer.setOnClickListener(buttonAddTransferListener);
    return header;
}