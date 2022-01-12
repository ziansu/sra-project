@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    com.kerchin.yellownote.utilities.Trace.d("NoteFragment onCreate");
    super.onCreate(savedInstanceState);
    android.content.IntentFilter filter = new android.content.IntentFilter();
    filter.addAction("refresh");
    mainStatus = new com.kerchin.yellownote.bean.ToolbarStatus();
    list = new java.util.ArrayList<>();
    primaryData = com.kerchin.yellownote.bean.PrimaryData.getInstance();
    getDataHelper = new com.kerchin.yellownote.bean.GetDataHelper();
}