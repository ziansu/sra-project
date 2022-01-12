@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    dataHandler.addOnStudentClassChangeListener(this);
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
        classNames = savedInstanceState.getStringArrayList(no.glv.android.stdntworkflow.InstalledClassesFragment.INST_STATE_CLASS_NAMES);
        config = ((no.glv.android.stdntworkflow.InstalledClassesFragment.ClassViewConfig) (savedInstanceState.getSerializable(no.glv.android.stdntworkflow.PARAM_CONFIG)));
    }else {
        classNames = dataHandler.getStudentClassNames();
        config = ((no.glv.android.stdntworkflow.InstalledClassesFragment.ClassViewConfig) (getArguments().getSerializable(no.glv.android.stdntworkflow.PARAM_CONFIG)));
    }
}