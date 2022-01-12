@java.lang.Override
public void generate(final com.spectralogic.ds3autogen.api.models.Ds3ApiSpec spec, final com.spectralogic.ds3autogen.api.FileUtils fileUtils, final java.nio.file.Path destDir) throws java.io.IOException {
    this.spec = spec;
    this.fileUtils = fileUtils;
    try {
        generateDs3_H();
        generateDs3_C();
    } catch (final freemarker.template.TemplateException e) {
        e.printStackTrace();
    } catch (final java.text.ParseException e) {
        e.printStackTrace();
    }
}