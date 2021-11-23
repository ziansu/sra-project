@java.lang.Override
public void setText(final java.lang.CharSequence newText) {
    super.setText(net.mwplay.nativefont.NativeLabel.append(newText, getStyle()));
}