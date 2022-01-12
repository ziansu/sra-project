public void insertMessage(com.avos.avoscloud.im.v2.AVIMMessage message, boolean breakpoint) {
    if (null == message) {
        return ;
    }
    insertMessages(java.util.Arrays.asList(message), breakpoint);
}