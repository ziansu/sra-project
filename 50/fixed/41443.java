public java.util.Set<appguarden.apppal.language.E> vars() {
    java.util.Set<appguarden.apppal.language.E> vars = this.subject.vars();
    vars.addAll(this.object.vars());
    return vars;
}