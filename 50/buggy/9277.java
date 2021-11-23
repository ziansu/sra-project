@java.lang.Override
public void onFailure(retrofit2.Call<appteam.nith.hillffair.models.Register> call, java.lang.Throwable t) {
    t.printStackTrace();
    loadToast.error();
}