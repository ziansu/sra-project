public static void treatException(ngspipesengine.utils.Log log, java.lang.String tag, java.lang.Exception e, java.lang.String msg) throws ngspipesengine.exceptions.EngineException {
    log.error(tag, msg);
    if (e != null) {
        log.error(tag, ("stackTrace: " + (ngspipesengine.utils.Utils.getStackTrace(e))));
        throw new ngspipesengine.exceptions.EngineException(((":: " + msg) + " ::"), e);
    }
    throw new ngspipesengine.exceptions.EngineException(((":: " + msg) + " ::"));
}