@java.lang.Override
protected org.rapidoid.html.Tag create() {
    if ((content) != null) {
        return content;
    }
    if ((!(isFieldProgrammatic())) || ((mode) == (FormMode.SHOW))) {
        if (required) {
            var = org.rapidoid.var.Vars.mandatory(var);
        }
    }
    return field(name, desc, type, options, var);
}