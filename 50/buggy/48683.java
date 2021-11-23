@java.lang.Override
public void bind(javax.script.Bindings binding) {
    binding.put("orient", new com.orientechnologies.orient.graph.script.OScriptGraphOrientWrapper());
}