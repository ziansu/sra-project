@java.lang.Override
public void bind(javax.script.Bindings binding) {
    if ((binding.get("orient")) == null)
        binding.put("orient", new com.orientechnologies.orient.graph.script.OScriptGraphOrientWrapper());
    
}