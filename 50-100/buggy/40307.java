private void task(java.lang.String name, java.lang.Integer id) {
    if (tasks.containsKey(name))
        getServer().getScheduler().cancelTask(((java.lang.Integer) (tasks.get(name))).intValue());
    
    if ((id.intValue()) == (-1))
        tasks.remove(name);
    else
        tasks.put(name, id);
    
}