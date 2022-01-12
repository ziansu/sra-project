@java.lang.Override
public void onColorSelected(@android.support.annotation.ColorInt
int i) {
    ((io.keepcube.kcapp.Data.Device.Led) (io.keepcube.kcapp.Data.Dashboard.getDevice(((view.getAdapterPosition()) - 1)))).setSolidColor(i);
    notifyDataSetChanged();
}