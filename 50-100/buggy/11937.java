@java.lang.Override
public java.lang.Object getSystemService(java.lang.String name) {
    if ((Context.LAYOUT_INFLATER_SERVICE.equals(name)) && ((com.smartnsoft.droid4me.support.v7.app.SmartAppCompatActivity.getWindow()) != null)) {
        return droid4mizer.getSystemService(name, com.smartnsoft.droid4me.support.v7.app.SmartAppCompatActivity.getWindow().getLayoutInflater());
    }else {
        return droid4mizer.getSystemService(name, super.getSystemService(name));
    }
}