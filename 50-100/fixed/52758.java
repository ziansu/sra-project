@java.lang.Override
public void loadMarkdown(java.io.InputStream in) {
    java.lang.Runnable fileLoader = () -> {
        int result = file.load(in);
        if (result == (com.wbrawner.simplemarkdown.model.MarkdownFile.SUCCESS)) {
            if ((editView) != null)
                editView.setMarkdown(getMarkdown());
            
            onMarkdownEdited();
        }else {
            if ((editView) != null)
                editView.showFileLoadeddError(result);
            
        }
    };
    fileLoader.run();
}