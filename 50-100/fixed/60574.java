@java.lang.Override
public void onClick(android.view.View v) {
    if (!(((com.supafly.swampdefense.MainActivity) (getActivity())).isPaused)) {
        ((com.supafly.swampdefense.MainActivity) (getActivity())).isPaused = true;
        android.app.DialogFragment hint = new com.supafly.swampdefense.TopFragment.Hint();
        hint.show(getActivity().getFragmentManager(), "hint");
        android.util.Log.e("Hint Dialog", "hint");
    }
}