public edu.chl.proximity.Models.Utils.Image getCreepImage() {
    edu.chl.proximity.Models.Utils.Image image = null;
    for (java.io.File imageFile : edu.chl.proximity.Models.Map.Creeps.ConcreteCreeps.Line1.imageFiles) {
        java.lang.String name = imageFile.getName();
        if (name.equals((("" + (creepLineIndex)) + ".png"))) {
            image = new edu.chl.proximity.Models.Utils.Image(imageFile);
            break;
        }
    }
    return image;
}