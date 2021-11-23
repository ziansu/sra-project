@java.lang.Override
public void onClick(android.view.View view) {
    database.getReference().push().setValue(new ru.arter_lab.addyourself.Ivents("12", "12", "323", "443", "3223", "54545", "43343"));
    addField();
}