public static void addKeyText(final org.eclipse.swt.widgets.MenuItem mntm, final java.lang.String text, final org.nschmidt.ldparteditor.enums.TextTask t) {
    mntm.setText(((text + "\t") + (org.nschmidt.ldparteditor.state.KeyStateManager.taskKeyMap.get(t))));
    mntm.addArmListener(new org.eclipse.swt.events.ArmListener() {
        @java.lang.Override
        public void widgetArmed(org.eclipse.swt.events.ArmEvent e) {
            mntm.setText(((text + "\t") + (org.nschmidt.ldparteditor.state.KeyStateManager.textTaskKeyMap.get(t))));
        }
    });
}