@java.lang.Override
public void onOpenOnScreenAnimationComplete() {
    m_animating = false;
    m_list.setEnabled(true);
    com.eegeo.menu.MenuViewJniMethods.ViewOpenCompleted(m_nativeCallerPointer);
}