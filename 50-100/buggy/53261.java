public boolean addCreator(de.uni.kassel.peermessage.interfaces.SendableEntityCreator createrClass) {
    if ((parent) != null) {
        return parent.addCreator(createrClass);
    }else {
        java.lang.Object reference = createrClass.getSendableInstance(true);
        creators.put(reference.getClass().getName(), createrClass);
        return true;
    }
}