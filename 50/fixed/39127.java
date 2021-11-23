@java.lang.Override
public void onClick(android.view.View v) {
    new com.thepoweroftether.interactivetraining.LearningModule.DownloadFileFromURL().execute(new java.lang.String[]{ com.thepoweroftether.interactivetraining.LearningModule.file_url , filename });
}