@java.lang.Override
public boolean add(org.eclipse.jetty.webapp.ClasspathPattern.Entry entry) {
    java.lang.String name = entry.getName();
    if (entry.isClassName())
        name += "$";
    else
        if (entry.isLocation())
            throw new java.lang.IllegalArgumentException(entry.toString());
        else
            if (".".equals(name))
                name = "";
            
        
    
    if ((this._entries.get(name)) != null)
        return false;
    
    this._entries.put(name, entry);
    return true;
}