@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
viewer.model.Tag createTag(@org.springframework.web.bind.annotation.RequestBody
viewer.model.Tag tag) {
    return tagService.createTag(tag.getTitle());
}