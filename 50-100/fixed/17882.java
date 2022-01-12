@java.lang.Override
public void run() {
    com.greenaddress.greenbits.GaService.PrettyPeer new_ppeer = new com.greenaddress.greenbits.GaService.PrettyPeer(peer);
    for (java.util.Iterator<com.greenaddress.greenbits.GaService.PrettyPeer> it = peerList.iterator(); it.hasNext();) {
        com.greenaddress.greenbits.GaService.PrettyPeer ppeer = it.next();
        if ((new_ppeer.peer) == (ppeer.peer)) {
            it.remove();
        }
    }
    peerListAdapter.notifyDataSetChanged();
}