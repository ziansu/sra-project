@java.lang.SuppressWarnings(value = "unchecked")
private static java.lang.Object[] doCallMethod(org.squiddev.plethora.api.method.IMethod method, org.squiddev.plethora.api.method.IUnbakedContext context, java.lang.Object[] args) throws dan200.computercraft.api.lua.LuaException {
    try {
        return method.apply(context.bake(), args);
    } catch (dan200.computercraft.api.lua.LuaException e) {
        throw e;
    } catch (java.lang.Throwable e) {
        org.squiddev.plethora.utils.DebugLogger.error(("Unexpected error calling " + (method.getName())), e);
        throw new dan200.computercraft.api.lua.LuaException(("Java Exception Thrown: " + (e.toString())));
    }
}