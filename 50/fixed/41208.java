@java.lang.Override
public boolean match(java.lang.String s) {
    return ((vm.getCurrentCd()) != null) && (vm.getCurrentCd().equals(s));
}