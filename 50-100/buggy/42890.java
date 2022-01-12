@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    if ((animAdapter.getItemCount()) < 2) {
        android.widget.Toast.makeText(getContext(), R.string.no_2_keyframes, Toast.LENGTH_SHORT).show();
    }else {
        io.keepcube.kcapp.Tools.Animation.Animation animation = animAdapter.getResult();
        io.keepcube.kcapp.Data.Device.Led d = ((io.keepcube.kcapp.Data.Device.Led) (io.keepcube.kcapp.Data.Dashboard.getDevice(view.getAdapterPosition())));
        d.setAnimation(animation);
        notifyDataSetChanged();
        dialog.dismiss();
    }
}