@java.lang.Override
public void hook(int sender, int recepiennt, bgu.dcr.az.api.Message msg) {
    if (msg.getName().equals("TERMINATE")) {
        (counts[sender])++;
    }
}