@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    butterknife.ButterKnife.bind(this, view);
    mDialogLabel.setText(getString(R.string.interpretation_text));
    mInterpretationText.setText(mInterpretation.getText());
    mInterpretation = new com.raizlabs.android.dbflow.sql.language.Select().from(org.dhis2.android.dashboard.api.models.Interpretation.class).where(com.raizlabs.android.dbflow.sql.builder.Condition.column(Interpretation.Table.ID).is(getArguments().getLong(Interpretation.Table.ID))).querySingle();
}