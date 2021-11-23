public boolean assignNewTeammate(com.esbjon.inventories.Teammate newTeammate) {
    if (!(teammates.contains(newTeammate, false))) {
        teammates.add(newTeammate);
        newTeammate.setRefInventory(this);
        if (level.isActive()) {
            this.updateItemsActions();
        }
        return true;
    }else
        return false;
    
}