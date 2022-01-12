@org.junit.Test
public void charsetRequiredBeforeRender() throws java.lang.Exception {
    com.fizzed.rocker.runtime.DefaultRockerModel model = new com.fizzed.rocker.runtime.DefaultRockerModel() {
        @java.lang.Override
        protected com.fizzed.rocker.runtime.DefaultRockerTemplate buildTemplate() throws com.fizzed.rocker.RenderingException {
            return new com.fizzed.rocker.runtime.DefaultRockerTemplate(this) {
                @java.lang.Override
                protected void __doRender() throws com.fizzed.rocker.RenderingException, java.io.IOException {
                }
            };
        }
    };
    try {
        com.fizzed.rocker.RockerOutput out = model.render();
        org.junit.Assert.fail();
    } catch (com.fizzed.rocker.RenderingException e) {
        org.junit.Assert.assertThat(e.getMessage(), containsString("charset must be initialized"));
    }
}