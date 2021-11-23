@java.lang.Override
public synchronized void run() {
    com.example.bbs.AmoComActivity.Text_Recv.append((x + "\n"));
    com.example.bbs.AmoComActivity.scrollView.fullScroll(ScrollView.FOCUS_DOWN);
}