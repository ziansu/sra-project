@java.lang.Override
protected void onUpdate(float tpf) {
    super.onUpdate(tpf);
    if ((counter) == 2) {
        org.shaman.rpg.engine.dialog.ui.DialogScreenController.switchTo(this, dialog, "Level", "Object", null);
    }
    (counter)++;
}