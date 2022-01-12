public void invalidateCache(java.lang.String group) {
    vg.civcraft.mc.namelayer.group.Group g = vg.civcraft.mc.namelayer.GroupManager.groupsByName.get(group);
    if (g != null) {
        g.setValid(false);
        vg.civcraft.mc.namelayer.GroupManager.groupsByName.remove(group);
        for (vg.civcraft.mc.namelayer.group.Group x : vg.civcraft.mc.namelayer.GroupManager.groupsById.values())
            if (x.getName().equals(g.getName()))
                vg.civcraft.mc.namelayer.GroupManager.groupsById.remove(x.getGroupId());
            
        
    }
}