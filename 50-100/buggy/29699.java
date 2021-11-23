public void run() {
    if (current != null) {
        current.getContentPane().getUnselectedStyle().setPaddingUnit(new byte[]{ com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS , com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS , com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS , com.codename1.ui.plaf.Style.UNIT_TYPE_PIXELS });
        current.getContentPane().getUnselectedStyle().setPadding(Component.BOTTOM, com.codename1.impl.ios.IOSImplementation.nativeInstance.getVKBHeight());
        if ((com.codename1.impl.ios.IOSImplementation.instance.currentEditing) != null) {
            com.codename1.impl.ios.IOSImplementation.instance.currentEditing.requestFocus();
        }
        current.revalidate();
    }
}