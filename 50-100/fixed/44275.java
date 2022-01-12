@java.lang.Override
public void run() {
    synchronized(com.naf.toast.ToastUtil2.synObj) {
        if ((com.naf.toast.ToastUtil2.toast) != null) {
            com.naf.toast.ToastUtil2.toast.cancel();
            com.naf.toast.ToastUtil2.toast = android.widget.Toast.makeText(act, msg, len);
        }else {
            com.naf.toast.ToastUtil2.toast = android.widget.Toast.makeText(act, msg, len);
        }
        com.naf.toast.ToastUtil2.toast.show();
    }
}