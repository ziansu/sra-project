@java.lang.Override
public void set(java.lang.Integer value) {
    this.value = value;
    for (controls.NumberListener<java.lang.Integer> vl : listeners) {
        vl.changed(this.value);
    }
}