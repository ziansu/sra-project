@java.lang.Override
public java.lang.Object findModule(java.lang.Class<?> filedClass, int id) {
    if (id <= 0) {
        return net.poksion.chorong.android.module.ModuleFactory.get(filedClass.getName());
    }
    if (!(android.view.View.class.isAssignableFrom(filedClass))) {
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