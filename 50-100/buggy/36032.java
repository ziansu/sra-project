public void projectImageClick(@org.jetbrains.annotations.NotNull
java.lang.String id) {
    if (isProjectFavourite(id)) {
        com.tcity.android.background.runnable.chain.ExecutableRunnableChain statusTask = com.tcity.android.background.runnable.chain.RunnableChain.getSingleRunnableChain(new com.tcity.android.background.runnable.primitive.ProjectStatusRunnable(id, myDb, myRestClient)).toAsyncTask(myChainListener);
        myChainListener.onStarted();
        statusTask.execute();
    }
}