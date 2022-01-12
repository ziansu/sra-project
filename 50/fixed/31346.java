@java.lang.Override
public void onClosedOnScreenAnimationComplete() {
    com.eegeo.menu.MenuViewJniMethods.ViewCloseCompleted(m_nativeCallerPointer);
    m_animating = false;
    m_list.setVisibility(View.GONE);
}