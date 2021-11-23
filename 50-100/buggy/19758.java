public net.sf.json.JSONObject saveOrUpdatePrefereces(@org.springframework.web.bind.annotation.RequestParam(value = "history")
java.lang.Boolean enableHistory, @org.springframework.web.bind.annotation.RequestParam(value = "bookmarks")
java.lang.Boolean enableBookmarks, @org.springframework.web.bind.annotation.RequestParam(value = "notes")
java.lang.Boolean enableNotes, @org.springframework.web.bind.annotation.RequestParam(value = "quickSearches")
java.lang.Boolean enableQuickSearches, @org.springframework.web.bind.annotation.RequestParam(value = "defaultSearch")
java.lang.Boolean enableDefaultSearch, @org.springframework.web.bind.annotation.RequestParam(value = "duplicateResults")
java.lang.Boolean enableDuplicateResults, @org.springframework.web.bind.annotation.RequestParam(value = "multiFiltering")
java.lang.Boolean enableMultiFiltering, @org.springframework.web.bind.annotation.RequestParam(value = "categories[]")
net.sf.json.JSONArray cats) {
    return cache.saveOrUpdatePreferences(enableHistory, enableBookmarks, enableNotes, enableQuickSearches, enableDefaultSearch, enableDuplicateResults, enableMultiFiltering, cats);
}