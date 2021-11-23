private static net.sf.memoranda.EventsManager.Year getYear(int y) {
    nu.xom.Elements yrs = net.sf.memoranda.EventsManager._root.getChildElements("year");
    java.lang.String yy = new java.lang.Integer(y).toString();
    for (int i = 0; i < (yrs.size()); i++)
        if (yrs.get(i).getAttribute("year").getValue().equals(yy))
            return new net.sf.memoranda.EventsManager.Year(yrs.get(i));
        
    
    return null;
}