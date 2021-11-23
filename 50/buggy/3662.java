@java.lang.Override
public boolean checkName() {
    return !(this.namePatern.matches(this.name));
}