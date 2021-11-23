@java.lang.Override
public void run() {
    while (true) {
        try {
            Interfaces.Msg currentMsg = ((Interfaces.Msg) (in.readObject()));
            java.lang.System.out.println(currentMsg);
            if (currentMsg != null) {
                msgs.add(currentMsg);
                Interfaces.Reply r = processMsg(currentMsg);
                this.out.writeObject(r);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}