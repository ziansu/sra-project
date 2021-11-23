@java.lang.Override
public void onResponse(@android.support.annotation.NonNull
retrofit2.Call<java.util.ArrayList<com.equaleyes.bugreporter.models.TrelloMember>> call, @android.support.annotation.NonNull
retrofit2.Response<java.util.ArrayList<com.equaleyes.bugreporter.models.TrelloMember>> response) {
    com.equaleyes.bugreporter.utils.BugReportSingleton.getInstance().trelloBoardList.get(boardId).setMembers(response.body());
    data.setValue(com.equaleyes.bugreporter.utils.Resource.success(response.body()));
}