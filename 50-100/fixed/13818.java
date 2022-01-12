@java.lang.Override
public void onClick(android.view.View v) {
    mFrame.setVisibility(View.VISIBLE);
    com.mad.utsstudcentre.Controller.HelpEnqFragment helpEnqFragment = com.mad.utsstudcentre.Controller.HelpEnqFragment.newInstance(com.mad.utsstudcentre.Controller.EnquiryTypeActivity.CODE_ENQ_TYPE);
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().addToBackStack(null).setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).replace(R.id.container, helpEnqFragment, com.mad.utsstudcentre.Controller.EnquiryTypeActivity.HELP_ENQUIRY_FRAGMENT).commit();
}