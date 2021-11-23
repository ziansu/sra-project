@java.lang.Override
public java.lang.String getDisplayName() {
    if ((getName().length()) > 15)
        return getName().substring(0, 15).concat("...");
    else
        return getName();
    
}