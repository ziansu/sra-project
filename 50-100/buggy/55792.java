@java.lang.Override
public build.pluto.output.None build(build.pluto.buildspoofax.Main.Input input) throws java.io.IOException {
    java.io.File ppInput = context.basePath("${lib}/EditorService-pretty.pp");
    java.io.File ppTermOutput = context.basePath("${include}/EditorService-pretty.pp.af");
    requireBuild(PPPack.factory, new build.pluto.buildspoofax.builders.PPPack.Input(context, ppInput, ppTermOutput));
    requireBuild(SpoofaxDefaultCtree.factory, input);
    return build.pluto.output.None.val;
}