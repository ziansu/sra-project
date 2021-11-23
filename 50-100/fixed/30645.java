@java.lang.Override
public void runQueryForUsername(final java.lang.String query) {
    mViewModel.setAuthor(null);
    mHandler.removeCallbacksAndMessages(null);
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            project.sherpa.utilities.FirebaseProviderUtils.queryForUsername(query, new project.sherpa.utilities.FirebaseProviderUtils.FirebaseListener() {
                @java.lang.Override
                public void onModelReady(project.sherpa.models.datamodels.abstractmodels.BaseModel model) {
                    if (model == null)
                        return ;
                    
                    project.sherpa.models.datamodels.Author author = ((project.sherpa.models.datamodels.Author) (model));
                    mViewModel.setAuthor(author);
                }
            });
        }
    }, project.sherpa.ui.activities.NewChatActivity.SEARCH_DELAY);
    filter(query);
}