public long[] getMembersList() {
    java.lang.String[] list = this.members.split(",");
    long[] memberLists = new long[list.length];
    for (int i = 0; i < (memberLists.length); i++)
        memberLists[i] = java.lang.Long.parseLong(list[i]);
    
    return memberLists;
}