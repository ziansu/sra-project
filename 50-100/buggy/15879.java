@java.lang.Override
protected void process(java.util.List<? extends ijfx.explorer.datamodel.Explorable> selected) {
    java.io.File file = mongis.utils.FXUtilities.openFolder("Open folder to save in...", "~/");
    if (file == null)
        return ;
    
    batchService.builder().add(selected).saveIn(file.getAbsolutePath()).startAsync(true).submit(loadingScreenService);
}