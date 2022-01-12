@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if (eu.tango.energymodeller.types.energyuser.VmDiskImage.class.equals(obj.getClass())) {
        eu.tango.energymodeller.types.energyuser.VmDiskImage img = ((eu.tango.energymodeller.types.energyuser.VmDiskImage) (obj));
        java.lang.String imgPath = img.getDiskImage();
        return diskImage.equals(imgPath);
    }
    return false;
}