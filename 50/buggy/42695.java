@java.lang.Override
public java.io.File target(java.io.File appBase) {
    org.osgl.util.E.illegalStateIf((!(act.Act.isDev())));
    return act.app.ProjectLayout.Utils.file(appBase, "target");
}