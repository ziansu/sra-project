@org.junit.Test
public void onlyCssResourceBundlesUsedFromCssFilesAreReturnedAsContentPaths() throws java.lang.Exception {
    given(defaultAspect).indexPageHasContent("").and(defaultAspect).containsFiles("themes/common/usedFile.ext", "resources/css/usedFile.ext", "resources/css/unusedFile.ext", "resources/some-dir/unusedFile.ext").and(defaultAspect).containsFileWithContents("themes/common/style.css", ".style { background:url('usedFile.ext'); background:url('../../resources/css/usedFile.ext');").and(brjs).localeSwitcherHasContents("").and(brjs).hasVersion("1234");
    then(defaultAspect).usedProdContentPathsForPluginsAre("cssresource", "cssresource/aspect_default_resource/resources/css/usedFile.ext", "cssresource/aspect_default/theme_common/usedFile.ext");
}