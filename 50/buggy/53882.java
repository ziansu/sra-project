@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    if (msg.contains("drawView")) {
    }else
        android.widget.Toast.makeText(context, (((fromName[0]) + ": ") + msg), Toast.LENGTH_SHORT).show();
    
}