@org.luaj.vm2.LuaFunction(value = "on")
public void on(org.luaj.vm2.LuaValue eventName, org.luaj.vm2.LuaValue callback) {
    eventHandlers.put(eventName.checkjstring(), callback.checkfunction());
}