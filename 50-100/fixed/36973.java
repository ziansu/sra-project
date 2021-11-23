@java.lang.Override
public void onClick(android.view.View v) {
    if ((story.getParentString()) != null) {
        java.lang.String uniqueIdentifier = story.getParentString();
        com.bauble_app.bauble.StorySingleton.getInstance().setViewKey(uniqueIdentifier);
        android.support.v4.app.FragmentTransaction ft = mFragManager.beginTransaction();
        ft.setCustomAnimations(R.anim.enter_from_top, R.anim.exit_to_bottom).replace(R.id.content, new com.bauble_app.bauble.ViewFragment()).addToBackStack("tag").commit();
    }
}