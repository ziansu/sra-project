private void trim(java.util.Vector<com.netscape.certsrv.request.IRequest> v, com.netscape.certsrv.request.RequestId marker) {
    int i = (v.size()) - 1;
    if (i == 0) {
        return ;
    }
    if (v.elementAt(i).getRequestId().toString().equals(marker.toString())) {
        v.remove(i);
    }
}