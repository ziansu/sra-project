@java.lang.Override
public boolean checkName() {
    return !(this.name.matches(this.namePatern));
}