public void resolveNamesAndTypes(de.lathanda.eos.interpreter.parsetree.Environment env) {
    env.storeVariables();
    for (de.lathanda.eos.interpreter.parsetree.Property p : props.values()) {
        p.resolveNamesAndTypes(self, env);
    }
    for (de.lathanda.eos.interpreter.parsetree.Method m : meths.values()) {
        env.setVariableType(ReservedVariables.SELF, self.ut);
        m.resolveNamesAndTypes(self, env);
        env.restoreVariables();
    }
    env.restoreVariables();
}