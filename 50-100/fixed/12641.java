public static void addImage(com.skilltradiez.skilltraderz.Image image) {
    if (image == null)
        return ;
    
    java.util.Set<com.skilltradiez.skilltraderz.Image> images = com.skilltradiez.skilltraderz.MasterController.getUserDB().getImagez();
    images.add(image);
    com.skilltradiez.skilltraderz.MasterController.getUserDB().getChangeList().add(image);
    image.notifyDB();
    com.skilltradiez.skilltraderz.DatabaseController.save();
}