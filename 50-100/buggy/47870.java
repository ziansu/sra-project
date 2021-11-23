@org.springframework.web.bind.annotation.RequestMapping(value = "/localGroups/{gid}/board")
public java.lang.String updateBoard(@org.springframework.web.bind.annotation.PathVariable(value = "gid")
long groupId, @org.springframework.web.bind.annotation.ModelAttribute(value = "boardForm")
de.naju.adebar.controller.forms.chapter.BoardForm boardForm, org.springframework.web.servlet.mvc.support.RedirectAttributes redirAttr) {
    de.naju.adebar.model.chapter.LocalGroup localGroup = localGroupManager.findLocalGroup(groupId).orElseThrow(java.lang.IllegalArgumentException::new);
    localGroup.setBoard(boardFormDataExtractor.extractBoard(boardForm));
    localGroupManager.updateLocalGroup(groupId, localGroup);
    redirAttr.addFlashAttribute("boardUpdated", true);
    return "redirect:/localGroups/" + groupId;
}