@java.lang.Override
public void onResume() {
    super.onResume();
    com.arnastofnun.idordabanki.Globals g = ((com.arnastofnun.idordabanki.Globals) (this.getActivity().getApplication()));
    if (g == null) {
        android.util.Log.v("Globals", "null");
    }else
        if ((g.getGlossaryState()) == null) {
            android.util.Log.v("GlossaryState", "null");
        }else {
            resumeGlossaryState(g);
        }
    
}