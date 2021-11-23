public boolean unregister(com.rehab.world.Entity e) {
    synchronized(com.rehab.world.InstanceManager.mManager) {
        int id = e.getId();
        if ((mWaitingInstanceTable.remove(id)) != null)
            return false;
        
        mGlobalInstanceTable.remove(id);
        return true;
    }
}