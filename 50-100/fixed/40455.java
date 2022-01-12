@java.lang.Override
public void saveMarkdown(java.lang.String filePath) {
    java.lang.Runnable fileSaver = () -> {
        int code;
        code = file.save(filePath);
        if ((editView) != null) {
            if (code == (com.wbrawner.simplemarkdown.model.MarkdownFile.SUCCESS)) {
                editView.showFileSavedMessage();
            }else {
                editView.showFileSavedError(code);
            }
        }
    };
    fileSaver.run();
}