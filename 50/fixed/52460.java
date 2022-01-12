public void setDebugging(org.bukkit.entity.Player target, boolean value) {
    synchronized(debug) {
        if (value)
            debug.add(target);
        else
            debug.remove(target);
        
    }
}