public void keyDown(java.lang.Integer keyInfo) {
    java.lang.Integer count = 0;
    if (com.Hook.common.RecordKeyboard.keyboardCount.containsKey(keyInfo)) {
        count = com.Hook.common.RecordKeyboard.keyboardCount.get(keyInfo);
    }
    com.Hook.common.RecordKeyboard.keyboardCount.put(keyInfo, (++count));
    ++(com.Hook.common.RecordKeyboard.pressCount);
    if (((com.Hook.common.RecordKeyboard.pressCount) >= (com.Hook.common.RecordKeyboard.flagTime)) && (((com.Hook.common.RecordKeyboard.pressCount) % (com.Hook.common.RecordKeyboard.flagTime)) == 0)) {
        write();
    }
}