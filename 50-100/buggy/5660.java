@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main__fitness_log);
    co.rpg_fitness_app.android.rpg_fitness_app.fitness_Package.FitnessLog fitnessLog = new co.rpg_fitness_app.android.rpg_fitness_app.fitness_Package.FitnessLog();
    ((android.widget.Button) (findViewById(R.id.button_add_activity))).setOnClickListener(new android.widget.Button.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.support.v4.app.FragmentManager fm = getFragmentManager();
            co.rpg_fitness_app.android.rpg_fitness_app.fitness_Package.AddLogTypeDialogFragment dF = new co.rpg_fitness_app.android.rpg_fitness_app.fitness_Package.AddLogTypeDialogFragment();
            dF.show(fm, "idgoal");
        }
    });
}