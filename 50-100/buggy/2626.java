@java.lang.Override
public void onClick(android.view.View v) {
    if (fileName != "") {
        com.burstlinker.budget.AudioFragment frag = new com.burstlinker.budget.AudioFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("mode", AudioFragment.MODE.PLAY);
        bundle.putString("file", fileName);
        frag.setArguments(bundle);
        android.app.FragmentTransaction transaction = ((android.app.Activity) (context)).getFragmentManager().beginTransaction();
        transaction.add(frag, "headless");
        transaction.commit();
    }
}