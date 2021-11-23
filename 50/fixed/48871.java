@java.lang.Override
public void onEffectCreated(kei.mobilehero.classes.attributes.Effect e) {
    effectsList.put(e.getName(), e);
    init();
}