public static com.edu.bit.nemare.todoapp.data.source.TasksRepository provideTasksRepository(@android.support.annotation.NonNull
android.content.Context context) {
    com.google.common.base.Preconditions.checkNotNull(context);
    return com.edu.bit.nemare.todoapp.data.source.TasksRepository.getInstance(com.edu.bit.nemare.todoapp.data.source.local.TasksLocalDataSource.getInstance(context), com.edu.bit.nemare.todoapp.data.source.remote.TasksRemoteDataSource.getInstance());
}