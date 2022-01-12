@java.lang.Override
public void onInterpretationTextClick(org.dhis2.android.dashboard.api.models.Interpretation interpretation) {
    org.dhis2.android.dashboard.ui.fragments.interpretation.InterpretationTextFragment.newInstance(interpretation.getId()).show(getChildFragmentManager());
}