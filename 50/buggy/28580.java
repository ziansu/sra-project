@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.example.nguyennam.financialbook.utils.FileHelper.clearTempFile(context);
    setListData();
}