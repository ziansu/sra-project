public int getCanvasHeight() {
    int height = 0;
    if ((htmlComponents) == null)
        return 0;
    
    try {
        for (HtmlComponent component : htmlComponents)
            if ((component instanceof HtmlTag) && (component.isVisible()))
                height += component.getHtmlComponentHeight();
            
        
    } catch (java.util.ConcurrentModificationException e) {
    }
    return height + (2 * (Y_MARGIN));
}