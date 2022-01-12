@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.e("ONCREATE", "CALLED");
    for (int i = 0; i < 30; i++) {
        list.add(new com.appbusters.robinkamboj.standardappguidelines.ModelMain(("Text One " + i), ("Text Two " + i)));
    }
    for (int i = 0; i < (list.size()); i++) {
        isSelected.add(false);
    }
}