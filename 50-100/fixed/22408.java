@java.lang.Override
public void loadMarkdown(java.lang.String filePath) {
    java.lang.Runnable fileLoader = () -> {
        int result = file.load(filePath);
        if ((editView) != null) {
            if (result == (com.wbrawner.simplemarkdown.model.MarkdownFile.SUCCESS)) {
                editView.setMarkdown(getMarkdown());
                onMarkdownEdited();
            }else {
                editView.showFileLoadeddError(result);
            }
        }
    };
    fileLoader.run();
}