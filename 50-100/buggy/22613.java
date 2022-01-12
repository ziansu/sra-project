@java.lang.Override
public void run() {
    org.cocos2dx.lib.Cocos2dxEditBox editBox = org.cocos2dx.lib.Cocos2dxEditBoxHelper.mEditBoxArray.get(index);
    if (editBox != null) {
        editBox.setChangedTextProgrammatically(true);
        editBox.setText(text);
        int position = text.length();
        editBox.setSelection(position);
    }
}