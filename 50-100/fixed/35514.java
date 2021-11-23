@java.lang.Override
public void onBindViewHolder(com.example.android.app.moviesapp.ImageAdapter.MovieViewHolder holder, int position) {
    android.util.Log.d(com.example.android.app.moviesapp.ImageAdapter.TAG, ((Generator.LOG_ENTERING) + (java.lang.Thread.currentThread().getStackTrace()[2].getMethodName())));
    holder.bind(position);
    android.util.Log.d(com.example.android.app.moviesapp.ImageAdapter.TAG, ((Generator.LOG_EXITING) + (java.lang.Thread.currentThread().getStackTrace()[2].getMethodName())));
}