@java.lang.Override
public void onColorSelected(int color) {
    ((io.keepcube.kcapp.Data.Device.Led) (io.keepcube.kcapp.Data.Dashboard.getDevice(((view.getAdapterPosition()) - 1)))).setSolidColor(color);
    notifyDataSetChanged();
    colorSelectDialog.dismiss();
}