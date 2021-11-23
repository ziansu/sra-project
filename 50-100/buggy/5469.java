public static void handleGoForwardControlVisibility() {
    if ((io.xdevs23.cornowser.browser.CornBrowser.publicWebRender.currentProgress) != 100) {
        io.xdevs23.cornowser.browser.CornBrowser.goForwardImgBtn.setBackgroundResource((io.xdevs23.cornowser.browser.browser.modules.WebThemeHelper.isDark ? R.drawable.main_cross_rot_icon_light : R.drawable.main_cross_rot_icon));
        io.xdevs23.cornowser.browser.CornBrowser.goForwardImgBtn.setVisibility(View.VISIBLE);
    }else {
        if (io.xdevs23.cornowser.browser.CornBrowser.publicWebRender.canGoForward()) {
            if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN))
                io.xdevs23.cornowser.browser.CornBrowser.goForwardImgBtn.setBackgroundResource((io.xdevs23.cornowser.browser.browser.modules.WebThemeHelper.isDark ? R.drawable.ic_arrow_forward_white_48dp : R.drawable.ic_arrow_forward_black_48dp));
            
            io.xdevs23.cornowser.browser.CornBrowser.goForwardImgBtn.setVisibility(View.VISIBLE);
        }else
            io.xdevs23.cornowser.browser.CornBrowser.goForwardImgBtn.setVisibility(View.INVISIBLE);
        
    }
}