@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton v, boolean isChecked) {
    no.glv.android.stdntworkflow.intrfc.StudentTask stdTask = ((no.glv.android.stdntworkflow.intrfc.StudentTask) (v.getTag()));
    if ((stdTask.isHandedIn()) == isChecked)
        return ;
    
    no.glv.android.stdntworkflow.core.DataHandler.GetInstance().handInTask(mTask, stdTask, isChecked);
}