@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getActivity(), "Saving", Toast.LENGTH_LONG).show();
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    if (((ca.lakeeffect.scoutingapp.MainActivity) (getActivity())).saveData())
        ((ca.lakeeffect.scoutingapp.MainActivity) (getActivity())).reset();
    
}