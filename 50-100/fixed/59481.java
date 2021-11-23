@java.lang.Override
public void onTextChanged(final java.lang.CharSequence s, int start, int before, int count) {
    org.cocos2dx.lib.Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnGLThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            org.cocos2dx.lib.Cocos2dxEditBoxHelper.__editBoxEditingChanged(index, s.toString());
        }
    });
}