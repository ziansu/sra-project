protected void disable() {
    for (java.util.Map.Entry<shivshank.pipeline.GLBuffer, shivshank.pipeline.Model.ShaderInput> e : captures.entrySet()) {
        e.getValue().disable();
    }
}