public int getCanvasWidth() {
    int width = 0;
    int tempWidth = 0;
    if ((htmlComponents) == null)
        return 0;
    
    try {
        for (HtmlComponent component : htmlComponents)
            if (component.isVisible())
                if (isBreak(component)) {
                    width = java.lang.Math.max(width, tempWidth);
                    tempWidth = 0;
                }else
                    tempWidth += component.getHtmlComponentWidth();
                
            
        
    } catch (java.util.ConcurrentModificationException e) {
    }
    return width + (2 * (X_MARGIN));
}