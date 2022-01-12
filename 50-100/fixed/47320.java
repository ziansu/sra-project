@java.lang.Override
public void onResponse(retrofit.Response<com.kmitl.movealarm.Model.Group> response, retrofit.Retrofit retrofit) {
    com.kmitl.movealarm.Model.Group group = response.body();
    if (group == null)
        return ;
    
    group.save(com.kmitl.movealarm.Service.MyApplication.getAppContext());
    group.getProgress().save(com.kmitl.movealarm.Service.MyApplication.getAppContext());
}