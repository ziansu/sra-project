@java.lang.Override
public void onClick(android.view.View v) {
    mFrame.setVisibility(View.VISIBLE);
    com.mad.utsstudcentre.Controller.SubEnqFragment subEnqFragment = com.mad.utsstudcentre.Controller.SubEnqFragment.newInstance((position + 1));
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().addToBackStack(null).setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).replace(R.id.container, subEnqFragment, com.mad.utsstudcentre.Controller.EnquiryTypeActivity.SUB_ENQUIRY_FRAGMENT).commit();
}