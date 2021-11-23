@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if (((enhancedStr) < 2) && (addPoints)) {
        (availablePoints)--;
        (enhancedStr)++;
    }else
        if (((enhancedStr) > 0) && (!(addPoints))) {
            (availablePoints)++;
            (enhancedStr)--;
        }
    
}