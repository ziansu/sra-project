public void run() {
    if (current != null) {
        current.getContentPane().getUnselectedStyle().setPaddingUnit(new byte[]{ com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS , com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS , com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS , com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS });
        current.getContentPane().getUnselectedStyle().setPadding(Component.BOTTOM, com.codename1.impl.ios.IOSImplementation.nativeInstance.getVKBHeight());
        com.codename1.ui.Component focused = current.getFocused();
        if (focused != null) {
            focused.requestFocus();
        }
        current.revalidate();
    }
}