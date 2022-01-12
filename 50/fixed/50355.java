public void writeLoginMessagePackage(int type) {
    try {
        com.ihuxu.chatxserver.common.model.MessagePackage mP = new com.ihuxu.chatxserver.common.model.MessagePackage(type);
        this.getObjectOutputStream().writeObject(mP);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}