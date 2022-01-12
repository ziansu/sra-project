@java.lang.Override
public void resolve(com.epimorphics.appbase.tasks.ActionManager am) {
    super.resolve(am);
    scriptDir = new java.io.File(am.getScriptDir());
}