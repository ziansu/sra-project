private static com.lzj.appupdate.UpdateManager getInstance() {
    for (; ;) {
        com.lzj.appupdate.UpdateManager manager = com.lzj.appupdate.UpdateManager.INSTANCE.get();
        if (manager != null)
            return manager;
        
        manager = new com.lzj.appupdate.UpdateManager();
        if (com.lzj.appupdate.UpdateManager.INSTANCE.compareAndSet(null, manager))
            return manager;
        
    }
}