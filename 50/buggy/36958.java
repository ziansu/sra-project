public java.lang.String getDockerHostIp() {
    java.lang.System.out.println("GET IP DOCKER HOST ON WINDOWS.");
    if (windowsSO.toLowerCase().contains("win")) {
        return getDockerHostIpOnWin();
    }else
        return "localhost";
    
}