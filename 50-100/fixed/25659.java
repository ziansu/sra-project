@java.lang.Override
public void onClick(android.view.View v) {
    com.irhamfauzan.finaltask.Lampu Mode = com.irhamfauzan.finaltask.PrefLampu.load(this);
    if (switchButtonMode.isChecked()) {
        Mode.mode = true;
        Payload = "3";
    }else {
        Mode.mode = false;
        Payload = "0";
    }
    com.irhamfauzan.finaltask.PrefLampu.save(Mode, this);
    publish();
}