public void setName(java.lang.String _name) {
    if ((_name == null) || (_name.equals(""))) {
        hasName = false;
        buildName();
    }else {
        name = _name;
        hasName = true;
    }
}