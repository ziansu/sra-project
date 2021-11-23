public java.lang.String membersToString() {
    java.lang.String list = "";
    if (!(RankMembers.isEmpty())) {
        int i = 1;
        for (java.lang.String member : RankMembers) {
            if (i == (RankMembers.size()))
                list += member;
            else
                list += member + ", ";
            
            i++;
        }
    }
    return list;
}