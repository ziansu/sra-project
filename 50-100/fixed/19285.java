public boolean isMember(long userId) {
    if (((this.members) == null) || ((this.members.length()) <= 0)) {
        return false;
    }
    java.lang.String[] membersId = this.members.split(",");
    for (int i = 0; i < (membersId.length); i++) {
        if (java.lang.String.valueOf(userId).equals(membersId[i])) {
            return true;
        }
    }
    return false;
}