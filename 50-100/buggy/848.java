@java.lang.Override
public int[] getClients() {
    java.util.Set s = sessionTable.keySet();
    int[] clients = new int[s.size()];
    java.util.Iterator it = s.iterator();
    int i = 0;
    while (it.hasNext()) {
        clients[0] = ((java.lang.Integer) (it.next())).intValue();
        i++;
    } 
    return clients;
}