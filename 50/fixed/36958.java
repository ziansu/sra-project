public java.lang.String getDockerHostIp() {
    if (windowsSO.toLowerCase().contains("win")) {
        return getDockerHostIpOnWin();
    }else
        return "localhost";
    
}