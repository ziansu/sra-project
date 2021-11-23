@org.springframework.web.bind.annotation.RequestMapping(value = "/colors")
public void colors(@org.springframework.web.bind.annotation.RequestParam
java.lang.String color1, @org.springframework.web.bind.annotation.RequestParam
java.lang.String color2) {
    java.util.List<java.lang.String> ls = new java.util.ArrayList<>();
    ls.add(color1);
    ls.add(color2);
    io.mlh.objects.Metadata md = ssService.getDisplayMetadata();
    md.setColors(ls);
    ssService.setDisplayMetadata(md);
}