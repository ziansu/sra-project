public synchronized int indexOf(java.lang.String ip) {
    for (int i = 0; i < (ipList.size()); i++)
        if (ipList.get(i).getIp().equals(ip))
            return i;
        
    
    return -1;
}