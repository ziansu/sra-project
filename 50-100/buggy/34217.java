public edu.chl.proximity.Models.Utils.Image getCreepImage() {
    edu.chl.proximity.Models.Utils.Image image = null;
    for (java.io.File imageFile : edu.chl.proximity.Models.Map.Creeps.ConcreteCreeps.Line1.imageFiles) {
        java.lang.String name = imageFile.getName();
        if (name.equals((("" + (creepLineIndex)) + ".png"))) {
            image = new edu.chl.proximity.Models.Utils.Image(imageFile);
            break;
        }
    }
    if (image == null) {
        image = new edu.chl.proximity.Models.Utils.Image(((edu.chl.proximity.Utilities.Constants.FILE_PATH) + "Creeps/Line1/7.png"));
    }
    return image;
}