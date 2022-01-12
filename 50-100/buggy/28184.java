public void focusLost(java.awt.event.FocusEvent evt) {
    for (int i = 0; (i < (foundList.size())) && ((butArr[i]) != null); i++)
        butArr[i].setBorderPainted(false);
    
}