private void onOptionClick(android.view.View v, java.lang.CharSequence type, int index) {
    android.widget.Toast.makeText(getContext(), ("selected: " + type), Toast.LENGTH_SHORT).show();
    com.mad.utsstudcentre.Controller.CentreFragment subEnqFragment = com.mad.utsstudcentre.Controller.CentreFragment.newInstance(type, index);
    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
    fragmentManager.beginTransaction().addToBackStack(null).setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).replace(R.id.container, subEnqFragment, com.mad.utsstudcentre.Controller.SubEnqFragment.CENTRE_FRAGMENT).commit();
}