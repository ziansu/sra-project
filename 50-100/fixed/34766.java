@java.lang.Override
public void onPageSelected(int position) {
    switch (position) {
        case 5 :
            mViewPager.setVisibility(View.GONE);
            isGuideClosed = true;
            if (installMessage.equals("setMessageProgressDialog")) {
                installMessage = "";
                sendmsg("showProgressDialog", "");
                sendmsg("setMessageProgressDialog", "Please wait...");
            }else
                if (installMessage.equals("installFailed")) {
                    installMessage = "";
                    sendmsg("installFailed", "");
                }else {
                    openWebViewIfAllConditionsMeet();
                }
            
            break;
        default :
    }
}