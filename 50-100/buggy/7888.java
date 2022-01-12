public org.apache.catalina.tribes.Member getMember(org.apache.catalina.tribes.Member mbr) {
    if (hasMembers()) {
        org.apache.catalina.tribes.Member result = null;
        for (int i = 0; (i < (this.members.length)) && (result == null); i++) {
            if (members[i].equals(mbr)) {
                result = members[i];
            }
        }
        return result;
    }else {
        return null;
    }
}