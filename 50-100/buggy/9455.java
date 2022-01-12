@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v4.app.FragmentManager.enableDebugLogging(true);
    setCaldroidListener(new com.roomorama.caldroid.CaldroidListener() {
        @java.lang.Override
        public void onSelectDate(java.util.Date date, android.view.View view) {
        }

        @java.lang.Override
        public void onChangeMonth(int month, int year) {
            requireLoader(org.totschnig.myexpenses.fragment.PlanMonthFragment.INSTANCES_CURSOR);
        }

        @java.lang.Override
        public void onGridCreated(android.widget.GridView gridView) {
            ((org.totschnig.myexpenses.fragment.TemplatesList) (getParentFragment())).registerForContextualActionBar(gridView);
        }
    });
}