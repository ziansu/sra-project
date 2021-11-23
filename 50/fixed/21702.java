@java.lang.Override
public net.idik.lib.slimadapter.viewinjector.DefaultViewInjector typeface(int id, android.graphics.Typeface typeface) {
    android.widget.TextView view = findViewById(id);
    view.setTypeface(typeface);
    return this;
}