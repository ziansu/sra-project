@java.lang.Override
public void onClick(android.view.View arg0) {
    if (!(com.vector.onetodo.AddTaskFragment.aq.id(R.id.repeat).getText().toString().equals("Never"))) {
        com.vector.onetodo.AddTaskFragment.aq.id(R.id.repeat).text(((android.widget.TextView) (com.vector.onetodo.AddTaskFragment.previousSelected)).getText().toString());
    }
    com.vector.onetodo.AddTaskFragment.aq.id(R.id.time_radio).textColor(android.graphics.Color.parseColor("#bababa"));
    com.vector.onetodo.AddTaskFragment.aq.id(R.id.forever_radio).textColor(getResources().getColor(R.color._777777));
}