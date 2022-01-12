@java.lang.Override
public void onClick(android.view.View v) {
    customView.setErase(false);
    brushDialog = new android.app.Dialog(context);
    brushDialog.setContentView(R.layout.brush_size_picker);
    brushDialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
    brushDialog.setCanceledOnTouchOutside(true);
    brushDialog.show();
}