public android.arch.lifecycle.LiveData<me.ashif.sampleapp.conf.Resource<me.ashif.sampleapp.data.model.ContentModel.Content>> getContent() {
    return new me.ashif.sampleapp.conf.NetworkBoundResource<me.ashif.sampleapp.data.model.ContentModel.Content, me.ashif.sampleapp.data.model.ContentModel>(mAppExecutors) {
        @java.lang.Override
        protected void saveCallResult(@android.support.annotation.NonNull
        me.ashif.sampleapp.data.model.ContentModel item) {
            mContentDao.saveContent(item.getContent());
        }

        @android.support.annotation.NonNull
        @java.lang.Override
        protected android.arch.lifecycle.LiveData<me.ashif.sampleapp.data.model.ContentModel.Content> loadFromDb() {
            return mContentDao.loadContents();
        }

        @android.support.annotation.NonNull
        @java.lang.Override
        protected retrofit2.Call<me.ashif.sampleapp.data.model.ContentModel> createCall() {
            return mApiService.getContentList();
        }
    }.getAsLiveData();
}