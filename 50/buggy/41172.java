@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    super.onDismiss(dialog);
    if (mFinishActivity) {
        android.widget.Toast.makeText(getActivity(), "จำเป็นต้องได้รับอนุญาตในการเข้าถึงข้อมูลตำแหน่งของคุณ", Toast.LENGTH_SHORT).show();
        getActivity().finish();
    }
}