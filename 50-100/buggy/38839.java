@org.springframework.web.bind.annotation.RequestMapping(value = "/init")
public com.endava.wiki.dto.MetadataDTO getInitData() {
    com.endava.wiki.dto.MetadataDTO metadataDTO = new com.endava.wiki.dto.MetadataDTO();
    try {
        if (java.net.InetAddress.getLocalHost().getHostAddress().equals(IP)) {
            java.lang.System.out.println("equals!");
            metadataDTO.setEnvironment(1);
        }else {
            java.lang.System.out.println("not equals!");
            metadataDTO.setEnvironment(0);
        }
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
    return metadataDTO;
}