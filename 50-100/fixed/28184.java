public void focusLost(java.awt.event.FocusEvent evt) {
    if ((butArr) != null)
        for (int i = 0; i < (butArr.size()); i++)
            if ((butArr.get(i)) != null)
                butArr.get(i).setBorderPainted(false);
            
        
    
}