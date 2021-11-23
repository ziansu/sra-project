public xyz.edmw.thread.Thread build() {
    xyz.edmw.thread.Thread thread = new xyz.edmw.thread.Thread();
    thread.securityToken = securityToken;
    thread.channelId = channelId;
    thread.parentId = parentId;
    return thread;
}