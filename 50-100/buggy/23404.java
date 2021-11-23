@java.lang.Override
public void onGlobalLayout() {
    int currentViewportHeight = container.getHeight();
    if (currentViewportHeight > (viewportHeight)) {
        aitLogo.setVisibility(View.VISIBLE);
    }else
        if (currentViewportHeight < (viewportHeight)) {
            aitLogo.setVisibility(View.GONE);
        }else {
            return ;
        }
    
    viewportHeight = currentViewportHeight;
}