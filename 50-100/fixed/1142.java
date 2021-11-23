@org.springframework.web.bind.annotation.RequestMapping(value = "/artist", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> searchArtist(@org.springframework.web.bind.annotation.RequestParam(value = "key")
java.lang.String key, @org.springframework.web.bind.annotation.RequestParam(value = "currPage")
int currPage, @org.springframework.web.bind.annotation.RequestParam(value = "perPage")
int perPage, @org.springframework.web.bind.annotation.RequestParam
org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> allRequestParams) throws java.io.IOException {
    java.lang.System.out.println(allRequestParams);
    if ((key == null) || (key.equals(""))) {
        key = "*:*";
    }
    return com.paypal.musictag.util.MusicTagUtil.wrapResult(searchServiceImpl.searchArtist(key, currPage, perPage, allRequestParams));
}