public static ru.ydn.wicket.wicketconsole.ScriptExecutorHolder get() {
    return org.apache.wicket.Application.get().getMetaData(ru.ydn.wicket.wicketconsole.ScriptExecutorHolder.SCRIPT_EXECUTOR_HOLDER);
}