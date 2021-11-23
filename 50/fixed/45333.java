@org.springframework.web.bind.annotation.RequestMapping(value = "/data")
public java.lang.Object getData() {
    io.mlh.objects.Metadata md = ssService.getDisplayMetadata();
    if (md != null) {
        md.setChangesMadeSinceLastUpdate(false);
        ssService.setDisplayMetadata(md);
    }
    return ssService.getDisplayData();
}