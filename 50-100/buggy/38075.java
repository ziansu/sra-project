@com.controller.RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
@com.controller.ResponseBody
public java.lang.String musicUpdate(@com.controller.PathVariable(value = "id")
java.lang.Integer id, @com.controller.ModelAttribute
com.bean.Music music) {
    try {
        music = musicRepository.update(id, music);
        service.save(music);
        return java.lang.String.format("Music [%s] successfully edited", id);
    } catch (java.lang.Exception e) {
        return java.lang.String.format("A problem occurred when editing Music [%s]", e.getMessage());
    }
}