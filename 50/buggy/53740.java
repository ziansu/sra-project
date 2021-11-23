@org.springframework.web.bind.annotation.RequestMapping(value = "/artist-area/{gid}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> artistArea(@org.springframework.web.bind.annotation.PathVariable(value = "gid")
java.lang.String gid) throws java.io.IOException {
    return com.paypal.musictag.util.MusicTagUtil.wrapResult(statisticsServiceImpl.ArtistArea(gid));
}