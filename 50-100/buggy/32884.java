@java.lang.Override
public java.lang.Object findModule(java.lang.Class<?> filedClass, int id) {
    if (id <= 0) {
        return net.poksion.chorong.android.module.ModuleFactory.get(filedClass.getName());
    }
    if (!(filedClass.isAssignableFrom(android.view.View.class))) {
        return null;
    }
    if ((activity) != null) {
        return activity.findViewById(id);
    }
    if ((view) != null) {
        return view.findViewById(id);
    }
    return null;
}