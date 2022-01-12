@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String defense = ((java.lang.String) (sp.getSelectedItem()));
    DataHolder.Autonomous auto = new DataHolder.Autonomous(defense, shotsMadeLow, shotsMadeHigh, breach.isChecked(), reach.isChecked());
    ma.goToTele(auto);
}