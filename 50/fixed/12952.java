@java.lang.Override
public void remove(haven.Gob gob, haven.Gob.Overlay overlay) {
    if (((overlayWeakReference) != null) && ((overlayWeakReference.get()) == overlay)) {
        gob.delattr(CustomAttrib.ReadyHideOrTubeAttrib.class);
    }
}