public net.sf.memoranda.EventsManager.Month getMonth(int m) {
    nu.xom.Elements ms = yearElement.getChildElements("month");
    java.lang.String mm = new java.lang.Integer(m).toString();
    for (int i = 0; i < (ms.size()); i++)
        if (ms.get(i).getAttribute("month").getValue().equals(mm))
            return new net.sf.memoranda.EventsManager.Month(ms.get(i));
        
    
    return null;
}