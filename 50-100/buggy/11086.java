@java.lang.Override
public void handleMessage(android.os.Message message) {
    if ((message.arg2) == 1) {
        switch (message.arg1) {
            case 1 :
                thread1JobDone = true;
                break;
            case 2 :
                thread2JobDone = true;
                break;
            case 3 :
                thread3JobDone = true;
                break;
        }
        if (((thread1JobDone) && (thread1JobDone)) && (thread1JobDone)) {
            themeAll.sortIndex();
        }
        adapterAll.notifyDataSetChanged();
    }
}