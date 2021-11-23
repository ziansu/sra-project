public org.apache.catalina.tribes.Member getMember(org.apache.catalina.tribes.Member mbr) {
    org.apache.catalina.tribes.Member[] members = this.members;
    if ((members.length) > 0) {
        org.apache.catalina.tribes.Member result = null;
        for (int i = 0; (i < (members.length)) && (result == null); i++) {
            if (members[i].equals(mbr)) {
                result = members[i];
            }
        }
        return result;
    }else {
        return null;
    }
}