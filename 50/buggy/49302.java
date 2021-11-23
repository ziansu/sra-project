public void and(com.rpsg.rpg.object.script.BaseScriptExecutor exe) {
    $(new com.rpsg.rpg.object.script.BaseScriptExecutor() {
        public void init() {
            __$(exe);
        }
    });
}