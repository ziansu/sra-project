@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<io.github.hkust1516csefyp43.easymed.pojo.Prescription>> call, java.lang.Throwable t) {
    t.printStackTrace();
    showUI();
}