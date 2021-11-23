@java.lang.Override
public java.lang.Character getCharacterForElement(int element) {
    if (((((com.benny.openlauncher.widget.AppDrawerVertical.apps) != null) && (element < (com.benny.openlauncher.widget.AppDrawerVertical.apps.size()))) && ((com.benny.openlauncher.widget.AppDrawerVertical.apps.get(element)) != null)) && ((com.benny.openlauncher.widget.AppDrawerVertical.apps.get(element).label.length()) > 0))
        return com.benny.openlauncher.widget.AppDrawerVertical.apps.get(element).label.charAt(0);
    else
        return '#';
    
}