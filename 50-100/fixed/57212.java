@java.lang.Override
public boolean accept(java.nio.file.Path icon) throws java.io.IOException {
    if ((icon == null) || (!(java.nio.file.Files.isRegularFile(icon))))
        return false;
    
    if ((icon != null) && ((icon.getFileName()) != null)) {
        java.lang.String name = icon.getFileName().toString();
        for (java.lang.String ext : org.fao.geonet.services.harvesting.Info.iconExt)
            if (name.endsWith(ext))
                return true;
            
        
    }
    return false;
}