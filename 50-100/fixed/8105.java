public java.util.List<java.lang.Long> getMembersList() {
    java.util.List<java.lang.Long> memberLists = new java.util.ArrayList<java.lang.Long>();
    if ((this.members.length()) <= 0)
        return memberLists;
    
    java.lang.String[] list = this.members.split(",");
    for (int i = 0; i < (list.length); i++)
        memberLists.add(java.lang.Long.parseLong(list[i]));
    
    return memberLists;
}