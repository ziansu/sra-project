public void spawnPartModel(org.json.JSONObject equipletCommand, HAL.listeners.EquipletCommandListener listener) {
    synchronized(this) {
        this.forwardTarget = listener;
        this.getRosInterface().postEquipletCommand(equipletCommand);
    }
}