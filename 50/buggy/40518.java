@java.lang.Override
public boolean checkName(java.lang.String name) {
    return !(this.namePatern.matches(name));
}