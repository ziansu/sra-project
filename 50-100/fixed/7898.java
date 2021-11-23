@java.lang.Override
public void onResume() {
    super.onResume();
    com.arnastofnun.idordabanki.Globals g = ((com.arnastofnun.idordabanki.Globals) (this.getActivity().getApplication()));
    if ((g == null) || ((g.getGlossaryState()) == null)) {
    }else {
        resumeGlossaryState(g);
    }
}