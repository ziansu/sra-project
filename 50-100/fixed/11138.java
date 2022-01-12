@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String address = "";
    if (v == (this.lblBitcoinAddress))
        address = this.getActivity().getString(R.string.bitcoin_address);
    else
        if (v == (this.lblLitecoinAddress))
            address = this.getActivity().getString(R.string.litecoin_address);
        
    
    net.alegen.android.netclip.util.Clipboard.getInstance(this.getActivity()).setClipboardText(address);
}