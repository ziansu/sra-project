public void checkoutCommit(final java.lang.String commitName) {
    me.sheimi.sgit.repo.tasks.repo.CheckoutTask checkoutTask = new me.sheimi.sgit.repo.tasks.repo.CheckoutTask(mRepo, commitName, false, new me.sheimi.sgit.repo.tasks.SheimiAsyncTask.AsyncTaskPostCallback() {
        @java.lang.Override
        public void onPostExecute(java.lang.Boolean isSuccess) {
            mActivity.reset(commitName);
        }
    });
    checkoutTask.executeTask();
}