public D5.conversation findConvo(D5.user otherUser) {
    for (int i = 0; i < (numConvo); i++) {
        if (((convo[i]) != null) && (convo[i].getDriver().getName().equals(otherUser.getName()))) {
            return convo[i];
        }
    }
    return null;
}