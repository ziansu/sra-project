@org.springframework.web.bind.annotation.GetMapping(value = "searchByKeyword")
public com.alibaba.fastjson.JSONObject searchByKeyword(java.lang.String keyword) {
    return searchByKeywordService.searchByKeyword(keyword);
}