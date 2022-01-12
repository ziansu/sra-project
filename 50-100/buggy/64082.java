@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, @android.support.annotation.IdRes
int checkedId) {
    switch (checkedId) {
        case R.id.radioButton1 :
            com.example.binaya.kuclassroom.DeflectionCalculator.total_marks = ((android.widget.RadioButton) (getView().findViewById(checkedId)));
        case R.id.radioButton2 :
            com.example.binaya.kuclassroom.DeflectionCalculator.total_marks = ((android.widget.RadioButton) (getView().findViewById(checkedId)));
    }
}